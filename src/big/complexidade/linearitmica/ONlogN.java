package big.complexidade.linearitmica;

import java.util.Arrays;

public class ONlogN {
    private static int comparacoes;
    private static int fusoes;

    public static void main(String[] args) {
        // Definição de baralhos com diferentes tamanhos
        int[] shortDeck = {7, 2, 9, 4, 3}; // 5 cartas
        int[] mediumDeck = {12, 5, 3, 7, 9, 2, 6, 8, 4, 10}; // 10 cartas
        int[] bigDeck = {32, 3, 17, 8, 29, 12, 1, 24, 6, 21, 14, 19, 4, 27, 16, 31,
                10, 25, 7, 23, 2, 30, 15, 5, 28, 9, 22, 11, 18, 13, 26, 20}; // 32 cartas

        // Ordenação e contagem de tempo
        sortAndMeasure(shortDeck, "Curto");
        sortAndMeasure(mediumDeck, "Médio");
        sortAndMeasure(bigDeck, "Grande");
    }

    /**
     * Ordena o baralho e mede o número de fusões e comparações.
     */
    private static void sortAndMeasure(int[] deck, String deckName) {
        comparacoes = 0;
        fusoes = 0;

        System.out.println("\nBaralho " + deckName + " antes da ordenação (" + deck.length + " cartas): " +
                Arrays.toString(deck));
        deck = mergeSort(deck);
        System.out.println("Baralho " + deckName + " depois da ordenação: " + Arrays.toString(deck));
        System.out.println("Etapas de fusão realizadas: " + fusoes);
        System.out.println("Total de comparações: " + comparacoes);
        System.out.println("====================================================");
    }

    /**
     * Divide o array em duas partes, ordena cada uma separadamente e depois junta as partes ordenadas.
     * Complexidade: O(n log n), pois há um custo logarítmico de divisão e um custo linear para a fusão.
     */
    private static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int meio = array.length / 2;
        int[] esquerda = Arrays.copyOfRange(array, 0, meio);
        int[] direita = Arrays.copyOfRange(array, meio, array.length);

        esquerda = mergeSort(esquerda);
        direita = mergeSort(direita);

        return merge(esquerda, direita);
    }

    /**
     * Junta dois arrays ordenados em um único array ordenado.
     * Durante esse processo, conta as fusões e comparações realizadas.
     */
    private static int[] merge(int[] esquerda, int[] direita) {
        fusoes++;
        int[] resultado = new int[esquerda.length + direita.length];
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            comparacoes++;
            if (esquerda[i] <= direita[j]) {
                resultado[k++] = esquerda[i++];
            } else {
                resultado[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) {
            resultado[k++] = esquerda[i++];
        }

        while (j < direita.length) {
            resultado[k++] = direita[j++];
        }

        return resultado;
    }
}
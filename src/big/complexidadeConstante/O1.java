package big.complexidadeConstante;

import org.apache.commons.lang3.time.StopWatch;

public class O1 {
    public static void main(String[] args) {
        // Matriz com vários vetores de diferentes tamanhos
        int[][] arrays = {
                {0},                              // Vetor com 1 elemento
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},  // Vetor com 10 elementos
                new int[100],                     // Vetor com 100 elementos
                new int[1000],                    // Vetor com 1000 elementos
                new int[10000],                   // Vetor com 10000 elementos
                new int[100000]};                 // Vetor com 100000 elementos

        // Inserindo valor no 1° elementos das listas com o tamanho de 100 a 100000
        arrays[2][0] = 2446;
        arrays[3][0] = 56624;
        arrays[4][0] = 4266246;
        arrays[5][0] = 634263466;

        // Retornando primeiro elemento de cada lista e medindo o tempo de execução
        returnFirstElement(arrays);
    }

    public static void returnFirstElement(int[][] arrays) {
        StopWatch watch = new StopWatch();

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("------------------------------------------------------------");
            // Começando a cronometragem do tempo para acessar e imprimir o 1° elemento da lista
            watch.start();
            System.out.printf("O 1° elemento da %dª lista é: %d\n", i + 1, arrays[i][0]);
            watch.stop();

            // Mostrando o tempo de processamento obtido pela cronometragem
            System.out.printf("Tempo de execução da (%dª lista): %.3f ms\n", i + 1, watch.getNanoTime() / 1_000_000.0);
            watch.reset();
        }
    }
}
package big.complexidade.quadratica;

public class ONelevado2 {
    public static void main(String[] args) {
        // Teste com diferentes quantidades de camisetas e tênis
        showPairs(1);
        showPairs(3);
        showPairs(5);
    }

    /**
     * Gera todas as combinações possíveis de camisetas e tênis.
     * Complexidade: O(n²), pois há um loop aninhado que percorre os elementos duas vezes.
     */
    public static void showPairs(int tshirtsShoesQuantity) {
        // Exibe um cabeçalho informativo
        System.out.println("=".repeat(50));
        System.out.println("Mostrando combinações para " + tshirtsShoesQuantity + " camisetas e tênis:");
        System.out.println("=".repeat(50));

        // Percorre todas as camisetas
        for (int i = 0; i < tshirtsShoesQuantity; i++) {
            // Para cada camiseta, percorre todos os tênis
            for (int j = 0; j < tshirtsShoesQuantity; j++) {
                System.out.println("Camiseta_" + (i + 1) + " + Tênis_" + (j + 1));
            }
            // Separação visual entre diferentes camisetas
            System.out.println("-".repeat(25));
        }
        // Exibe o número total de combinações geradas
        System.out.println("O total de combinações é: " + tshirtsShoesQuantity * tshirtsShoesQuantity + "\n");
    }
}

package big.complexidade.linear;

public class ON {
    public static void main(String[] args) {
        // Definição das pias, cada array interno representa uma pia com pratos
        int[][] sinks = {
                {1},                            // Pia com 1 prato
                {1, 2, 3, 4, 5},                // Pia com 5 pratos
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} // Pia com 10 pratos
        };

        // Executa a lavagem dos pratos e retorna o tempo total para cada pia
        int[] times = washDishes(sinks);

        // Exibe o tempo total gasto para cada pia
        System.out.println("Demorou " + times[0] + " segundos para lavar a primeira pia que continha 1 prato.");
        System.out.println("Demorou " + times[1] + " segundos para lavar a segunda pia que continha 5 pratos.");
        System.out.println("Demorou " + times[2] + " segundos para lavar a terceira pia que continha 10 pratos.");
    }

    /**
     * O tempo de execução cresce linearmente com base no número de pratos.
     * Cada prato leva 30 segundos para ser lavado.
     * Complexidade: O(N), onde N é o número total de pratos em cada pia.
     */
    private static int[] washDishes(int[][] sinks) {
        int[] times = new int[sinks.length]; // Array para armazenar o tempo de cada pia

        // Percorre cada pia
        for (int i = 0; i < sinks.length; i++) {
            int time = 0;

            // Percorre os pratos dentro da pia
            for (int j = 0; j < sinks[i].length; j++) {
                System.out.printf("Lavando o %d° prato da %d° pia.\n", j + 1, i + 1);
                time += 30; // Cada prato leva 30 segundos para ser lavado
            }

            System.out.println("======================================");

            times[i] = time; // Armazena o tempo total gasto na lavagem da pia
        }

        return times;
    }
}
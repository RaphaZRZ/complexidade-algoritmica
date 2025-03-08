package big.complexidade.logaritmica;

public class OlogN {
    public static void main(String[] args) {
        // Definindo os números que extrairemos a raiz quadrada
        int firstNumber = 144;
        int secondNumber = 1048576;
        int thirdNumber = 268402689;

        // Tirando as raízes de cada número e contando a quantidade de etapas
        Result sqrtFirstNumber = calculateSquareRoot(firstNumber);
        Result sqrtSecondNumber = calculateSquareRoot(secondNumber);
        Result sqrtThirdNumber = calculateSquareRoot(thirdNumber);

        System.out.println("Raiz quadrada de " + firstNumber + " = " + sqrtFirstNumber.value + " (" + sqrtFirstNumber.steps + " etapas)");
        System.out.println("Raiz quadrada de " + secondNumber + " = " + sqrtSecondNumber.value + " (" + sqrtSecondNumber.steps + " etapas)");
        System.out.println("Raiz quadrada de " + thirdNumber + " = " + sqrtThirdNumber.value + " (" + sqrtThirdNumber.steps + " etapas)");
    }

    /**
     * Calcula a raiz quadrada inteira de um número usando a fórmula de Newton-Raphson.
     * Este converge para a raiz quadrada rapidamente, reduzindo o erro exponencialmente,
     * o que faz com que a complexidade seja aproximadamente O(log n).
     */
    public static Result calculateSquareRoot(int number) {
        int previousApprox = number; // Aproximação inicial (começamos com o próprio número)
        int currentApprox = (previousApprox + number / previousApprox) / 2; // Primeira tentativa de aproximação
        int totalSteps = 1; // Contador de etapas do algoritmo

        // Enquanto a aproximação estiver melhorando, continuamos refinando a estimativa
        while (currentApprox < previousApprox) {
            previousApprox = currentApprox;
            currentApprox = (previousApprox + number / previousApprox) / 2;
            totalSteps++; // Contamos quantas iterações foram necessárias
        }

        return new Result(previousApprox, totalSteps);
    }

    static class Result {
        int value;  // Valor da raiz quadrada inteira
        int steps;  // Número de etapas realizadas para encontrar a raiz

        Result(int value, int steps) {
            this.value = value;
            this.steps = steps;
        }
    }
}

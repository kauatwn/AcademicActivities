package sem_2.ap_2.atv_4.ex_10;

import java.util.Random;

// Crie um array bidimensional de 10x10. Guarde em um outro array: o maior valor, o menor valor e a média dos valores
// deste array.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        double[] result = new double[3];

        fillMatrix(matrix);

        System.out.println("Matriz gerada:");
        printMatrix(matrix);
        System.out.println();

        result[0] = getHighestValue(matrix);
        result[1] = getLowestValue(matrix);
        result[2] = getAverageValue(matrix);

        System.out.println();
        System.out.printf("Maior valor : %.0f%n", result[0]);
        System.out.printf("Menor valor: %.0f%n", result[1]);
        System.out.printf("Média dos valores do array: %.2f%n", result[2]);
    }

    private static void fillMatrix(int[][] matrix) { // O(n^2) - Quadrática
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 100);
            }
        }
    }

    private static void printMatrix(int[][] matrix) { // O(n^2) - Quadrática
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%02d", matrix[i][j]);

                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");

            if (i < matrix.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print("]");
    }

    private static int getHighestValue(int[][] matrix) { // O(n^2) - Quadrática
        int highestValue = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > highestValue) {
                    highestValue = matrix[i][j];
                }
            }
        }

        return highestValue;
    }

    private static int getLowestValue(int[][] matrix) { // O(n^2) - Quadrática
        int lowestValue = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < lowestValue) {
                    lowestValue = matrix[i][j];
                }
            }
        }

        return lowestValue;
    }

    private static double getAverageValue(int[][] matrix) { // O(n^2) - Quadrática
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        int row = matrix.length;
        int column = matrix[0].length;
        return sum / (row * column);
    }
}

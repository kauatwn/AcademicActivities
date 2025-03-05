package sem_2.ap_2.atv_4.ex_11;

import java.util.Random;

// Crie um array bidimensional de 7x7 e exiba a soma dos valores das colunas í­mpares e a multiplicação dos valores das
// linhas pares deste array.

// Obs.:
// Índice 0 = 1ª coluna
// Índice 1 = 2ª coluna

// Índice 0 = 1ª linha
// Índice 1 = 2ª linha

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        fillMatrix(matrix);

        System.out.println("Matriz gerada:");
        printMatrix(matrix);
        System.out.println();

        // Soma das colunas ímpares (índices 0, 2, 4, 6)
        System.out.println();
        System.out.println("Soma das colunas ímpares:");
        sumOddColumns(matrix);

        // Multiplicação das linhas pares (índices 1, 3, 5)
        System.out.println();
        System.out.println("Multiplicação das linhas pares:");
        multiplyEvenRows(matrix);
    }

    private static void fillMatrix(int[][] matrix) { // O(n^2) - Quadrática
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1, 10);
            }
        }
    }

    private static void printMatrix(int[][] matrix) { // O(n^2) - Quadrática
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d", matrix[i][j]);

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

    private static void sumOddColumns(int[][] matrix) { // O(n^2) - Quadrática
        for (int j = 0; j < matrix[0].length; j += 2) { // Percorre colunas ímpares
            int sumOddColumns = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumOddColumns += matrix[i][j];
            }
            System.out.printf("Coluna %d: %d%n", j + 1, sumOddColumns);
        }
    }

    private static void multiplyEvenRows(int[][] matrix) { // O(n^2) - Quadrática
        for (int i = 1; i < matrix.length; i += 2) { // Percorre linhas pares
            long multiplicationEvenRows = 1;
            for (int j = 0; j < matrix[i].length; j++) {
                multiplicationEvenRows *= matrix[i][j];
            }
            System.out.printf("Linha %d: %d%n", i + 1, multiplicationEvenRows);
        }
    }
}

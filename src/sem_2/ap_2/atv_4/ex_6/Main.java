package sem_2.ap_2.atv_4.ex_6;

import java.util.Random;

// Preencha um array bidimensional de 10x10 com números inteiros positivos em todas as posições, exceto na diagonal
// principal que deverá ser preenchida com o valor -1.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        // Complexidade O(n^2) - Quadrática
        fillMatrix(matrix);

        // Complexidade O(n^2) - Quadrática
        printMatrix(matrix);
    }

    private static void fillMatrix(int[][] matrix) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = -1;
                } else {
                    matrix[i][j] = random.nextInt(0, 100);
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";

        System.out.println("[");
        for (int x = 0; x < matrix.length; x++) {
            System.out.print("  [");
            for (int y = 0; y < matrix[x].length; y++) {
                if (matrix[x][y] == -1) {
                    System.out.printf("%s%-2d%s", RED, matrix[x][y], RESET);
                } else {
                    System.out.printf("%02d", matrix[x][y]);
                }

                if (y < matrix[x].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");

            if (x < matrix.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.printf("]%n%n");
    }
}

package sem_2.ap_2.atv_4.ex_3;

import java.util.Random;

// Crie um método que procura um valor em um array bidimensional e retorna um array com a coordenada de onde o valor
// foi encontrado.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[5][5];
        fillArray(matrix);

        int value = random.nextInt(100);
        int[] coordinates = findValue(matrix, value);

        if (coordinates[0] == -1) {
            System.out.printf("Valor '%d' não encontrado!%n", value);
        } else {
            System.out.printf("Valor '%d' encontrado na posição [%d, %d]%n", value, coordinates[0], coordinates[1]);
        }
        System.out.println();

        System.out.println("Matriz gerada:");
        printMatrix(matrix);
    }

    private static void fillArray(int[][] matrix) { // O(n^2) - Quadrática
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) { // O(n)
            for (int j = 0; j < matrix[i].length; j++) { // O(n)
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    private static int[] findValue(int[][] matrix, int value) { // O(n^2) - Quadrática
        for (int i = 0; i < matrix.length; i++) { // O(n)
            for (int j = 0; j < matrix[i].length; j++) { // O(n)
                if (matrix[i][j] == value) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };
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
}

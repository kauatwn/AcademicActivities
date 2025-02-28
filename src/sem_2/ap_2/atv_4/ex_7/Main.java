package sem_2.ap_2.atv_4.ex_7;

import java.util.Random;

// Prencha um array tridimensional apenas com valores pares. Em seguida, conte quantos valores são divisí­veis por 5.
public class Main {
    public static void main(String[] args) {
        int[][][] array3D = new int[3][3][3];

        fillArray3D(array3D);

        System.out.println("Array 3D gerado:");
        printArray3D(array3D);
        System.out.println();

        int count = countDivisibleByFive(array3D);
        System.out.printf("%nQuantidade de valores divisíveis por 5 no array 3D: %d%n", count);
    }

    private static void fillArray3D(int[][][] array3D) { // O(n^3) - Cúbica
        Random random = new Random();

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    int value = random.nextInt(100);

                    if (isEven(value)) {
                        array3D[i][j][k] = value;
                    } else {
                        k--;
                    }
                }
            }
        }
    }

    private static boolean isEven(int value) { // O(1) - Constante
        return value % 2 == 0;
    }

    private static int countDivisibleByFive(int[][][] array3D) { // O(n^3) - Cúbica
        int count = 0;

        for (int[][] matrix : array3D) {
            for (int[] row : matrix) {
                for (int element : row) {
                    if (element % 5 == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static void printArray3D(int[][][] array3D) { // O(n^3) - Cúbica
        System.out.println("[");
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("  [");
            for (int j = 0; j < array3D[i].length; j++) {
                System.out.print("    [");
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.printf("%02d", array3D[i][j][k]);

                    if (k < array3D[i][j].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");

                if (j < array3D[i].length - 1) {
                    System.out.print(",");
                }
                System.out.println();
            }
            System.out.print("  ]");

            if (i < array3D.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print("]");
    }
}

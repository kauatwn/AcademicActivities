package sem_2.ap_2.atv_1.ex_1;

import java.util.Random;

// Crie um vetor tridimensional de inteiros. Preencha-o com valores aleatórios entre 0 e 99.
public class Main {
    public static void main(String[] args) {
        int[][][] array_3d = new int[3][3][3];

        fillArray(array_3d);
        printArray(array_3d);
    }

    private static void fillArray(int[][][] array_3d) {
        Random random = new Random();
        for (int x = 0; x < array_3d.length; x++) {
            for (int y = 0; y < array_3d[x].length; y++) {
                for (int z = 0; z < array_3d[x][y].length; z++) {
                    array_3d[x][y][z] = random.nextInt(100);
                }
            }
        }
    }

    private static void printArray(int[][][] array_3d) {
        System.out.println("[");
        for (int x = 0; x < array_3d.length; x++) {
            System.out.println("  [");
            for (int y = 0; y < array_3d[x].length; y++) {
                System.out.print("    [");
                for (int z = 0; z < array_3d[x][y].length; z++) {
                    System.out.printf("%02d", array_3d[x][y][z]);

                    if (z < array_3d[x][y].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");

                if (y < array_3d[x].length - 1) {
                    System.out.print(",");
                }
                System.out.println();
            }
            System.out.print("  ]");

            if (x < array_3d.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println("]");
    }
}

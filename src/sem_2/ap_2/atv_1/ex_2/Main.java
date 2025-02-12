package sem_2.ap_2.atv_1.ex_2;

import java.util.Random;

// Crie um vetor com quatro dimensões de inteiros. Preencha-o com valores aleatórios entre 0 e 99.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][][] array_4d = new int[2][1][1][2];

        System.out.println("[");
        for (int x = 0; x < array_4d.length; x++) {
            System.out.println("  [");
            for (int y = 0; y < array_4d[x].length; y++) {
                System.out.println("    [");
                for (int z = 0; z < array_4d[x][y].length; z++) {
                    System.out.print("      [");
                    for (int w = 0; w < array_4d[x][y][z].length; w++) {
                        array_4d[x][y][z][w] = random.nextInt(100);
                        System.out.printf("%02d", array_4d[x][y][z][w]);

                        if (w < array_4d[x][y][z].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.print("]");

                    if (z < array_4d[x][y].length - 1) {
                        System.out.print(",");
                    }
                    System.out.println();
                }
                System.out.print("    ]");

                if (y < array_4d[x].length - 1) {
                    System.out.print(",");
                }
                System.out.println();
            }
            System.out.print("  ]");

            if (x < array_4d.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.print("]");
    }
}

package sem_2.ap_2.atv_2.ex_4;

import java.util.Random;

// Crie um programa com um método que realize a busca sequencial de um valor em um array bidimensional de inteiros e
// retorne as coordenadas (linha e coluna) da posição do valor encontrado.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][4];
        int value = random.nextInt(10);

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = random.nextInt(10);
            }
        }

        int[] coordinates = findValue(array, value);

        if (coordinates != null) {
            System.out.printf("Valor %d encontrado.%n", value);
            System.out.printf("Coordenadas: [%d, %d]", coordinates[0], coordinates[1]);
        } else {
            System.out.printf("Valor %d não encontrado.", value);
        }
    }

    private static int[] findValue(int[][] array, int value) {
        int[] coordinates = new int[2];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] == value) {
                    coordinates[0] = row;
                    coordinates[1] = column;

                    return coordinates;
                }
            }
        }

        return null;
    }
}

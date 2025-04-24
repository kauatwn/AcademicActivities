package sem_2.ap_2.atv_4.ex_8;

import java.util.Arrays;
import java.util.Random;

// Crie um array unidimensional com 10 valores e um outro array com 20 posições, com os números do primeiro array
// seguidos do dobro deste número.
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[array1.length * 2];

        fillArray(array1);

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            array2[i + array1.length] = array1[i] * 2;
        }

        System.out.printf("Array 1: %s%n", Arrays.toString(array1));
        System.out.printf("Array 2: %s%n", Arrays.toString(array2));
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}

package sem_2.ap_2.atv_4.ex_8;

import java.util.Arrays;
import java.util.Random;

// Crie um array unidimensional com 10 valores e um outro array com 20 posições, com os números do primeiro array
// seguidos do dobro deste número.
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[20];

        fillArray(array1);

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            array2[i + 10] = array1[i] * 2;
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}

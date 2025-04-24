package sem_2.ap_2.atv_4.ex_9;

import java.util.Arrays;
import java.util.Random;

// Preencha um array unidimensional com 50 números inteiros. Em seguida, substitua os valores repetidos por 0.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];

        // Complexidade O(n) - Linear
        fillArray(array);
        System.out.println(Arrays.toString(array));

        // Complexidade O(n^2) - Quadrática
        replaceRepeatedValues(array);

        System.out.println(Arrays.toString(array));
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }
    }

    private static void replaceRepeatedValues(int[] array) { // O(n^2)
        for (int i = 0; i < array.length; i++) { // O(n)
            for (int j = i + 1; j < array.length; j++) { // O(n)
                if (array[i] == array[j] && array[i] != 0) {
                    array[j] = 0;
                }
            }
        }
    }
}

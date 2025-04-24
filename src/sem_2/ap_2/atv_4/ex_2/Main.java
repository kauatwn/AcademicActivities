package sem_2.ap_2.atv_4.ex_2;

import java.util.Arrays;
import java.util.Random;

// Use o método anterior para preencher um array com valores não repetidos.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Complexidade O(n^2) - Quadrática
        fillArray(array);

        System.out.println(Arrays.toString(array));
    }

    private static boolean hasValue(int[] array, int value) { // O(n) - Linear
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }

        return false;
    }

    private static void fillArray(int[] array) { // O(n^2) - Quadrática
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt(100);

            if (!hasValue(array, value)) {
                array[i] = value;
            } else {
                i--;
            }
        }
    }
}

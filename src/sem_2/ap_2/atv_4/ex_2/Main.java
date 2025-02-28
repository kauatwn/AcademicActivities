package sem_2.ap_2.atv_4.ex_2;

import java.util.Random;

// Use o método anterior para preencher um array com valores não repetidos.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Complexidade O(n^2) - Quadrática
        fillArray(array);

        // Complexidade O(n) - Linear
        printArray(array);
    }

    private static boolean hasValue(int[] array, int value) {
        for (int element : array) { // O(n)
            if (element == value) {
                return true;
            }
        }

        return false;
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) { // O(n)
            int value = random.nextInt(100);

            if (!hasValue(array, value)) { // O(n)
                array[i] = value;
            } else {
                i--;
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // O(n)
            System.out.printf("%d", array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}

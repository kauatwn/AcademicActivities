package sem_2.ap_2.atv_3.ex_2;

import java.util.Random;

// No mesmo programa do exercício anterior, crie um método para realizar a busca binária e compare a quantidade de
// repetições necessárias em cada um dos métodos. Compare também o tempo gasto.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        fillArray(array);

        Random random = new Random();
        int value = random.nextInt(0, 100_000);

        // Busca linear -> O(n)
        long start = System.currentTimeMillis();
        int linearSearchPosition = linearSearch(array, value);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

        System.out.printf("Valor %d encontrado na posição %d%n", value, linearSearchPosition);
        System.out.printf("Tempo de execução: %dms%n", elapsedTime);

        System.out.println();

        // Busca binária -> O(log n)
        start = System.currentTimeMillis();
        int binarySearchPosition = binarySearch(array, value);
        end = System.currentTimeMillis();
        elapsedTime = end - start;

        if (binarySearchPosition == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.printf("Valor %d encontrado na posição %d%n", value, binarySearchPosition);
            System.out.printf("Tempo de execução: %dms%n", elapsedTime);
        }
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static int linearSearch(int[] array, int target) {
        int position = -1;
        int count = 0;
        final String MESSAGE = "Repetições na Busca Linear: %d%n";

        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == target) {
                System.out.printf(MESSAGE, count);
                return i;
            }
        }

        System.out.printf(MESSAGE, count);
        return position;
    }

    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int count = 0;
        final String MESSAGE = "Repetições na Busca Binária: %d%n";

        while (left <= right) {
            count++;
            // // Chance de overflow
            // int middle = (left + right) / 2;

            // Evita overflow
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                System.out.printf(MESSAGE, count);
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.printf(MESSAGE, count);
        return -1;
    }
}

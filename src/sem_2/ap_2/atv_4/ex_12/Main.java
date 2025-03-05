package sem_2.ap_2.atv_4.ex_12;

import java.util.Arrays;
import java.util.Random;

// Melhore o método do exercício 1, indicando o í­ndice inicial e o í­ndice final da busca.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        fillArray(array);

        System.out.println("Array gerado:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        int value = random.nextInt(10);
        int startIndex = random.nextInt(array.length);
        int endIndex = random.nextInt(array.length);

        if (hasValue(array, value, startIndex, endIndex)) {
            System.out.printf(
                    "O array possui o valor '%d' entre os índices %d e %d.%n",
                    value,
                    startIndex,
                    endIndex);
        } else {
            System.out.printf(
                    "O array não possui o valor '%d' entre os índices %d e %d.%n",
                    value,
                    startIndex,
                    endIndex);
        }
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static boolean hasValue(int[] array, int value, int startIndex, int endIndex) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }
}

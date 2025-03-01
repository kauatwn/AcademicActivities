package sem_2.ap_2.atv_4.ex_1;

import java.util.Random;

// Crie um método que verifica se um array possui um determinado valor.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        fillArray(array);

        int value = random.nextInt(100);

        if (hasValue(array, value)) {
            System.out.printf("O array possui o valor '%d'", value);
        } else {
            System.out.printf("O array não possui o valor '%d'", value);
        }
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private static boolean hasValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }

        return false;
    }
}

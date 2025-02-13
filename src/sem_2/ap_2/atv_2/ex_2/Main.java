package sem_2.ap_2.atv_2.ex_2;

import java.util.Random;

// Crie um programa com um método que realize a busca sequencial de um valor em um array de inteiros e retorne o número
// de vezes que o elemento foi encontrado.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5000];
        int value = random.nextInt(500);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int occurrences = countOccurrences(array, value);

        System.out.printf("O valor %d foi encontrado %d vezes no array.", value, occurrences);
    }

    private static int countOccurrences(int[] array, int value) {
        int count = 0;

        for (int number : array) {
            if (number == value) {
                count++;
            }
        }

        return count;
    }
}

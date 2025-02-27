package sem_2.ap_2.atv_3.ex_1;

import java.util.Random;

// Crie um programa que preencha um array de inteiros com 100.000 valores ordenados e depois, através de um método,
// realize a busca de um valor gerado aleatoriamente utilizando busca sequencial.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        fillArray(array);

        Random random = new Random();
        int value = random.nextInt(0, 100_000);

        // Busca linear -> O(n)
        long start = System.currentTimeMillis();
        int foundPosition = findPosition(array, value);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

        if (foundPosition == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.printf("Valor %d encontrado na posição %d%n", value, foundPosition);
            System.out.printf("Tempo de execução: %dms%n", elapsedTime);
        }
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    private static int findPosition(int[] array, int target) {
        int position = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return position;
    }
}

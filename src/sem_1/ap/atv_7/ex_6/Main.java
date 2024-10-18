package sem_1.ap.atv_7.ex_6;

import java.util.Scanner;

/* Faça três funções:

    (a) Recebe um vetor de inteiros como entrada e retorna o maior valor.
    (b) Recebe um vetor de inteiros como entrada e retorna o menor valor.
    (c) Recebe um vetor de inteiros como entrada e retorna a média ((max + min) / 2).
    max = maior valor do vetor.
    min = menor valor do vetor.

Obs.: Utilize as duas primeiros funções para fazer a função do item C */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.printf("Digite o valor da posição %d do vetor: ", i);
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println();

        int maxValue = getMaxValue(array);
        System.out.printf("O maior valor do vetor é: %d", maxValue);
        System.out.println();

        int minValue = getMinValue(array);
        System.out.printf("O menor valor do vetor é: %d", minValue);
        System.out.println();

        double media = calculateAverage(array);
        System.out.printf("A média do maior e menor valor do vetor é: %.2f", media);
        System.out.println();
    }

    public static int getMaxValue(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static int getMinValue(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static double calculateAverage(int[] array) {
        return (double) (getMaxValue(array) + getMinValue(array)) / 2;
    }
}

package sem_1.ap.atv_6.ex_4;

/* Leia 5 elementos em um vetor inteiro A. Construa um outro vetor B, de mesma dimensão de A, sendo que, seus elementos
são a multiplicação dos elementos de A por 3. Mostre os elementos de B. */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[5];
        int[] arrayB = new int[arrayA.length];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
            arrayB[i] = arrayA[i] * 3;
        }
        sc.close();

        System.out.println("\nVetor A: " + Arrays.toString(arrayA));
        System.out.println("Vetor B: " + Arrays.toString(arrayB));
    }
}

package sem_1.ap.atv_6.ex_6;

/* Leia dois vetores: A (de tamanho 4) e B (de tamanho 7).
    - Construa um terceiro vetor que seja a junção de A e B.
    - Colocar os elementos de A, e em sequência, colocar os elementos de B. */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[4];
        int[] arrayB = new int[7];
        int[] arrayC = new int[arrayA.length + arrayB.length];

        System.out.println("Digite 4 números inteiros para o vetor A:");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
            arrayC[i] = arrayA[i];
        }

        System.out.println("\nDigite 7 números inteiros para o vetor B:");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
            arrayC[arrayA.length + i] = arrayB[i];
        }
        sc.close();

        System.out.println("\nVetor A: " + Arrays.toString(arrayA));
        System.out.println("Vetor B: " + Arrays.toString(arrayB));
        System.out.println("Vetor C: " + Arrays.toString(arrayC));
    }
}

package sem_1.ap.atv_6.ex_5;

/* Leia dois vetores A e B de mesmo tamanho. Construa o vetor C, de mesmo tamanho, cujo elementos de C são a subtração
dos elementos de A por B. Mostre C.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayA = new int[5];
        int[] arrayB = new int[arrayA.length];
        int[] arrayC = new int[arrayA.length];

        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }

        System.out.println("\nDigite 5 números inteiros para o vetor B:");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
            arrayC[i] = arrayA[i] - arrayB[i];
        }
        sc.close();

        System.out.println("\nVetor A: " + Arrays.toString(arrayA));
        System.out.println("Vetor B: " + Arrays.toString(arrayB));
        System.out.println("Vetor C: " + Arrays.toString(arrayC));
    }
}

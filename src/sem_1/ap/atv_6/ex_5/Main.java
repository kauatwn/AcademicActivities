package sem_1.ap.atv_6.ex_5;

/* Leia dois vetores A e B de mesmo tamanho. Construa o vetor C, de mesmo tamanho, cujo elementos de C são a subtração
dos elementos de A por B. Mostre C.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nDigite 5 números inteiros para o vetor B:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
            c[i] = a[i] - b[i];
        }
        sc.close();

        System.out.println("\nVetor A: " + Arrays.toString(a));
        System.out.println("Vetor B: " + Arrays.toString(b));
        System.out.println("Vetor C: " + Arrays.toString(c));
    }
}

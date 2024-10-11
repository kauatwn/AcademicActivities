package sem_1.ap.atv_6.ex_2;

/* Leia 10 valores inteiros e armazene-os em um vetor.
    - Faça um laço para imprimir os elementos pares.
    - Faça um laço para imprimir os elementos ímpares. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Números pares:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}

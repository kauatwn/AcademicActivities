package sem_1.ap.atv_6.ex_1;

import java.util.Scanner;

// Leia 10 números inteiros do usuário armazene-os em um vetor, e imprima os números lidos.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Números digitados: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

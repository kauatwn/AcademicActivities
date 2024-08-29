package sem_1.ap.atv_1.ex_4;

/* Faça um algoritmo que leia quatro números inteiros.
    - Calcule e mostre a soma desses números. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        int n4 = sc.nextInt();

        int result = n1 + n2 + n3 + n4;

        System.out.println("A soma dos quatro números é: " + result);
        sc.close();
    }
}

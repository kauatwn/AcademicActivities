package sem_1.ap.atv_2.ex_4;

/* Ler dois números (ponto flutuante) e apresentá-los em ordem decrescente.
    - Supor que não sejam iguais. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double number2 = sc.nextDouble();

        System.out.println("\nOrdem decrescente: ");
        if (number1 > number2) {
            System.out.println(number1);
            System.out.println(number2);
        } else {
            System.out.println(number2);
            System.out.println(number1);
        }

        sc.close();
    }
}

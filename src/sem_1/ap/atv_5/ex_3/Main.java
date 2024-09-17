package sem_1.ap.atv_5.ex_3;

/* Ler um número inteiro e imprimir na tela a sequência de 	números que vai do número 1 até o número lido. Exemplo:
    - Digite um número: 8
    - Sequência: 1 2 3 4 5 6 7 8. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = sc.nextInt();

        System.out.print("Sequência: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

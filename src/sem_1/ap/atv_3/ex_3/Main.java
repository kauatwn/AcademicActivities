package sem_1.ap.atv_3.ex_3;

/* Faça um algoritmo que leia o período em que um aluno estuda:
    - M - Matutino;
    - V - Vespertino;
    - N - Noturno.

Escreva uma das opções a seguir:

    M = Bom dia
    V = Boa tarde
    N = Boa noite */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o período em que você estuda (M - Matutino, V - Vespertino, N - Noturno): ");
        char period = sc.nextLine().toUpperCase().charAt(0);

        switch (period) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Período inválido.");
                sc.close();
        }

        sc.close();
    }
}

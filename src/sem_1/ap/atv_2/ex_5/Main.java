package sem_1.ap.atv_2.ex_5;

/* Faça um algoritmo para ler um número inteiro. Verifique se o número está no intervalo entre 50 (inclusive) e 100
(inclusive):
    - Se estiver:
        - Imprimir "Pertence ao intervalo";
    - Senão:
        - Imprimir "Não pertence ao intervalo". */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 50 && number <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }

        sc.close();
    }
}

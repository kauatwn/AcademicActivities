package sem_1.ap.atv_7.ex_4;

/* Crie um método chamado isPar(). Seu método deve receber um número inteiro como parâmetro de entrada e deve retornar:
    - True se o número for par.
    - False se o número for ímpar.

Para testar seu método, faça um programa que fica pedindo para o usuário digitar números. Para cada número digitado,
chame a função isPar(numero) passando o número e imprima "número par" caso o número seja par. "número ímpar" caso o
número seja ímpar. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (isPar(num)) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }

    public static boolean isPar(int num) {
        return num % 2 == 0;
    }
}

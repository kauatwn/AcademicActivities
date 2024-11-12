package sem_1.ap.atv_7.ex_3;

/* Criar um método chamado encontrarMax(). Seu método deve receber dois números (int) como parâmetro de entrada e deve
retornar o maior valor entre esses números. Para testar seu programa:
    - Leia dois números do usuário.
    - Chame o método passando esses números.
    - Imprima o valor retornado pelo seu método. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println("O maior número é: " + encontrarMax(num1, num2));
    }

    public static int encontrarMax(int num1, int num2) {
        int max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        return max;
    }
}

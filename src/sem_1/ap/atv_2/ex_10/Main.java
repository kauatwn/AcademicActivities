package sem_1.ap.atv_2.ex_10;

/* Faça um algoritmo para encontrar o maior número entre 3 números inteiros.
O algoritmo deve ler três inteiros:
    - Se forem todos iguais, imprimir: "os números são iguais";
    - Caso contrário, imprimir o maior dos 3 números. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int largestNumber = 0;

        if (num1 == num2 && num1 == num3) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2 && num1 > num3) {
            largestNumber = num1;
        } else if (num2 > num1 && num2 > num3) {
            largestNumber = num2;
        } else {
            largestNumber = num3;
        }

        System.out.println("O maior número é: " + largestNumber);

        sc.close();
    }
}

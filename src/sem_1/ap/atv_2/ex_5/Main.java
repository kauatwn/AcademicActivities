package sem_1.ap.atv_2.ex_5;

/* Faça um algoritmo que receba dois números. De acordo com a escolha do usuário, execute as operações listadas a seguir:
    M = Média entre os números digitados;
    S = Diferença do maior pelo menor;
    P = Produto entre os números digitados;
    D = Divisão do primeiro pelo segundo. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha uma das opções:");
        System.out.println("M - Média entre os números");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - Produto entre os números");
        System.out.println("D - Divisão do primeiro pelo segundo");

        System.out.print("Digite a sua escolha: ");
        char choice = sc.next().toUpperCase().charAt(0);
        double result;

        switch (choice) {
            case 'M':
                result = (num1 + num2) / 2;
                System.out.printf("A média entre os números é: " + result);
                break;
            case 'S':
                if (num1 > num2) {
                    result = num1 - num2;
                } else {
                    result = num2 - num1;
                }
                System.out.println("A diferença do maior pelo menor é: " + result);
                break;
            case 'P':
                result = num1 * num2;
                System.out.println("O produto entre os números é: " + result);
                break;
            case 'D':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("A divisão do primeiro pelo segundo é: " + result);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                sc.close();
        }

        sc.close();
    }
}

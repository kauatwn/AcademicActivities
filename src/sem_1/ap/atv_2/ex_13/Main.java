package sem_1.ap.atv_2.ex_13;

/* Criar uma calculadora de operações básicas:
    - Soma, subtração, multiplicação e divisão;
     - O algoritmo deve ler dois números e o sinal correspondente à operação desejada;
     - Utilize o tipo char para ler a operação;
     - No final deve ser impresso o resultado.

Restrições:
    - Se o sinal digitado não corresponder a uma operação, apresentar a mensagem Sinal Inválido e finalizar.
    - Para a operação de divisão verificar se o divisor é válido (maior que zero)! Caso seja menor ou igual a zero,
informar a mensagem "Impossível dividir‼". */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Resultado: %.2f%n", result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("Resultado: %.2f%n", result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("Resultado: %.2f%n", result);
                break;
            case '/':
                if (num2 > 0) {
                    result = num1 / num2;
                    System.out.printf("Resultado: %.2f%n", result);
                } else {
                    System.out.println("Impossível dividir‼");
                }
                break;
            default:
                System.out.println("Sinal Inválido");
                break;
        }

        sc.close();
    }
}

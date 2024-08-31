package sem_1.ap.atv_2.ex_9;

/* A prefeitura do Rio de Janeiro abriu uma linha de crédito para 	os funcionários estatuários. O valor máximo da
prestação não poderá ultrapassar 30% do salário bruto.

Fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
Exemplo:
    - Salário bruto: 1200,00
    - Valor da prestação: 400,00
    - Empréstimo não pode ser concedido! */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double grossSalary = sc.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double installmentValue = sc.nextDouble();

        double maxInstallmentValue = grossSalary * ((double) 30 / 100);

        if (installmentValue <= maxInstallmentValue) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        sc.close();
    }
}

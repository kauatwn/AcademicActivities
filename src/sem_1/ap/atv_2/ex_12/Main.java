package sem_1.ap.atv_2.ex_12;

/* Ler o salário de uma pessoa e calcular e imprimir o desconto do INSS (calculado‼) de acordo com a tabela a seguir:

    | <= R$ 600,00                | Isento
    | R$ 600,00 e <= R$ 1200,00   | 20%
    | R$ 1200,00 e <= R$ 2000,00  | 25%
    | <= R$ 2000,00               | 30% */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$ ");
        double grossSalary = sc.nextDouble();

        double discount;

        if (grossSalary <= 600.00) {
            discount = 0.0;
        } else if (grossSalary <= 1200.00) {
            discount = grossSalary * ((double) 20 / 100);
        } else if (grossSalary <= 2000.00) {
            discount = grossSalary * ((double) 25 / 100);
        } else {
            discount = grossSalary * ((double) 30 / 100);
        }

        double netSalary = grossSalary - discount;

        System.out.printf("Desconto do INSS: R$ %.2f%n", discount);
        System.out.printf("Salário líquido: R$ %.2f%n", netSalary);
        sc.close();
    }
}

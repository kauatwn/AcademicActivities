package sem_1.ap.atv_2.ex_4;

/* Um funcionário receberá aumento de acordo com seu plano de trabalho.
Faça um algoritmo que leia:
    - O plano de trabalho;
    - E o salário atual de um funcionário.

Calcule e imprima o seu novo salário.
    A = 10%
    B = 15%
    C = 20% */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o plano de trabalho (A, B, C): ");
        char plan = sc.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: ");
        double currentSalary = sc.nextDouble();
        double newSalary = currentSalary;

        switch (plan) {
            case 'A':
                newSalary += currentSalary * ((double) 10 / 100);
                break;
            case 'B':
                newSalary += currentSalary * ((double) 15 / 100);
                break;
            case 'C':
                newSalary += currentSalary * ((double) 20 / 100);
                break;
            default:
                System.out.println("Plano de trabalho inválido.");
                sc.close();
        }

        System.out.printf("O novo salário é: %.2f%n", newSalary);
        sc.close();
    }
}

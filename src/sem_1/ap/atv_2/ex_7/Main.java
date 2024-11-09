package sem_1.ap.atv_2.ex_7;

/* A empresa XSoftware concedeu um bônus de 20% do valor do salário a todos os funcionários com tempos de trabalho na
empresa igual ou superior a cinco anos, e de 10% aos demais funcionários.
Faça um algoritmo que leia o salário e a quantidade de anos de cada funcionário, calcule e imprima o valor do bônus. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salary = sc.nextDouble();

        System.out.print("Digite o tempo de trabalho na empresa (em anos): ");
        int yearsWorked = sc.nextInt();

        double bonus;

        if (yearsWorked >= 5) {
            bonus = salary * ((double) 20 / 100);
        } else {
            bonus = salary * ((double) 10 / 100);
        }

        System.out.printf("O valor do bônus é: R$ %.2f%n", bonus);
        sc.close();
    }
}

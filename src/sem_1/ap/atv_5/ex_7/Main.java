package sem_1.ap.atv_5.ex_7;

/* Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas, 	calcule e mostre:
    - A quantidade de pessoas maiores de 50 anos;
    - A média das alturas das pessoas com idade entre 10 e 20 anos;
    - A porcentagem de pessoas com peso inferior a 40 quilos. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOver50 = 0;
        int countHeightBetween10And20 = 0;
        double totalHeightBetween10And20 = 0;
        int countWeightBelow40 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i);
            int age = sc.nextInt();

            System.out.printf("Digite a altura (em metros) da pessoa %d: ", i);
            double height = sc.nextDouble();

            System.out.printf("Digite o peso da pessoa %d: ", i);
            double weight = sc.nextDouble();

            if (age > 50) {
                countOver50++;
            }

            if (age >= 10 && age <= 20) {
                countHeightBetween10And20++;
                totalHeightBetween10And20 += height;
            }

            if (weight < 40) {
                countWeightBelow40++;
            }

            System.out.println();
        }

        sc.close();

        double averageHeightBetween10And20;
        if (countHeightBetween10And20 > 0) {
            averageHeightBetween10And20 = totalHeightBetween10And20 / countHeightBetween10And20;
        } else {
            averageHeightBetween10And20 = 0;
        }

        double percentageWeightBelow40 = (countWeightBelow40 * 100.0) / 10;

        System.out.printf("Quantidade de pessoas com mais de 50 anos: %d%n", countOver50);
        System.out.printf("Média de altura das pessoas com idade entre 10 e 20 anos: %.2fm%n",
                averageHeightBetween10And20);
        System.out.printf("Porcentagem de pessoas com peso inferior a 40 quilos: %.2f%%%n", percentageWeightBelow40);
    }
}

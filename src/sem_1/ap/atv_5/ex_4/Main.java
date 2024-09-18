package sem_1.ap.atv_5.ex_4;

/* Faça um algoritmo que receba a idade e a altura de 10 pessoas:
    – Calcule e mostre a média das alturas daquelas com mais de 50 anos. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalHeightOverFifty = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i);
            int age = sc.nextInt();

            System.out.printf("Digite a altura (em metros) da pessoa %d: ", i);
            double height = sc.nextDouble();

            if (age > 50) {
                totalHeightOverFifty += height;
                count++;
            }
        }

        sc.close();

        if (count > 0) {
            double average = totalHeightOverFifty / count;
            System.out.printf("A média das alturas das pessoas com mais de 50 anos é: %.2fm\n", average);
        }
    }
}

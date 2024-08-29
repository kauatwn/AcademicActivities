package sem_1.ap.atv_1.ex_12;

/* Faça um algoritmo que receba um número, calcule e mostre:
    - O número elevado ao quadrado;
    - O número elevado ao cubo;
    - A raiz quadrada do número digitado;
    - O número elevado a potência 10.

Obs.: Use Math.pow, Math.sqrt e Math.PI*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double number = sc.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double squareRoot = Math.sqrt(number);
        double powerOfTen = Math.pow(number, 10);

        System.out.println("Número elevado ao quadrado: " + square);
        System.out.println("Número elevado ao cubo: " + cube);
        System.out.println("Raiz quadrada do número: " + squareRoot);
        System.out.println("Número elevado à potência 10: " + powerOfTen);
        sc.close();
    }
}

package sem_1.ap.atv_1.ex_5;

/* Faça um algoritmo que leia três notas de um aluno:
    – Calcule e mostre a média aritmética do aluno. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        double grade1 = sc.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        double grade2 = sc.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        double grade3 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3;

        System.out.println("A média das aritmética do aluno é: " + average);
        sc.close();
    }
}

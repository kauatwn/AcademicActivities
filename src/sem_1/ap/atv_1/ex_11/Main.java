package sem_1.ap.atv_1.ex_11;

/* Construir um algoritmo que leia:
    - O ano de nascimento de uma pessoa e o ano atual.
Calcule e mostre:
    - A idade dessa pessoa;
    - Quantos anos essa pessoa terá em 2030. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento de uma pessoa: ");
        int yearOfBirth = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int currentYear = sc.nextInt();

        int currentAge = currentYear - yearOfBirth;

        int ageIn2030 = 2030 - yearOfBirth;

        System.out.println("A idade dessa pessoa é: " + currentAge);
        System.out.println("Em 2030, essa pessoa terá " + ageIn2030 + " anos");
        sc.close();
    }
}

package sem_1.ap.atv_4.ex_6;

/* Faça um algoritmo que leia dez números inteiros e positivos:
    - Mostre o menor entre eles. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int smallestNumber = 0;

        System.out.print("Digite o " + count + "º número inteiro e positivo: ");
        int firstNumber = sc.nextInt();

        while (firstNumber <= 0) {
            System.out.print("Número inválido. Por favor, digite um número positivo: ");
            firstNumber = sc.nextInt();
        }

        count++;
        while (count <= 10) {
            System.out.print("Digite o " + count + "º número inteiro e positivo: ");
            int nextNumber = sc.nextInt();

            while (nextNumber <= 0) {
                System.out.print("Número inválido. Por favor, digite um número positivo: ");
                nextNumber = sc.nextInt();
            }

            if (nextNumber < firstNumber) {
                smallestNumber = nextNumber;
            }

            count++;
        }

        System.out.println("O menor número digitado é: " + smallestNumber);
    }
}

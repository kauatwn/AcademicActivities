package sem_1.ap.atv_4.ex_6;

/* Faça um algoritmo que leia dez números inteiros e positivos:
    - Mostre o menor entre eles. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;

        System.out.printf("Digite o %dº número inteiro e positivo: ", count);
        int smallestNumber = sc.nextInt();

        while (smallestNumber <= 0) {
            System.out.print("Número inválido. Por favor, digite um número positivo: ");
            smallestNumber = sc.nextInt();
        }

        count++;

        while (count <= 10) {
            System.out.printf("Digite o %dº número inteiro e positivo: ", count);
            int nextNumber = sc.nextInt();

            while (nextNumber <= 0) {
                System.out.print("Número inválido. Por favor, digite um número positivo: ");
                nextNumber = sc.nextInt();
            }

            if (nextNumber < smallestNumber) {
                smallestNumber = nextNumber;
            }

            count++;
        }

        sc.close();

        System.out.println("O menor número digitado é: " + smallestNumber);
    }
}

package sem_1.ap.atv_4.ex_3;

/* Construir um algoritmo que leia um número inteiro e imprime a sequência:
    – 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024.
    – Enquanto o valor da sequência for menor ou igual ao número lido. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int maxLimit = sc.nextInt();
        sc.close();

        int currentSequenceValue = 1;

        while (currentSequenceValue <= maxLimit) {
            if (currentSequenceValue * 2 > maxLimit) {
                System.out.print(currentSequenceValue + ".");
            } else {
                System.out.print(currentSequenceValue + ", ");
            }

            currentSequenceValue *= 2;
        }
    }
}

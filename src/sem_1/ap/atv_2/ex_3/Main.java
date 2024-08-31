package sem_1.ap.atv_2.ex_3;

/* Ler dois valores inteiros:
    - E se forem iguais, mostrar “Números iguais”;
    - Caso contrário, apresentar a diferença do maior pelo menor. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int value1 = sc.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int value2 = sc.nextInt();

        if (value1 == value2) {
            System.out.println("Números iguais");
        } else {
            int maxValue;
            int minValue;

            if (value1 > value2) {
                maxValue = value1;
                minValue = value2;
            } else {
                maxValue = value2;
                minValue = value1;
            }

            int difference = maxValue - minValue;
            System.out.println("Diferença: " + difference);
        }

        sc.close();
    }
}

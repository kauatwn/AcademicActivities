package sem_1.ap.atv_1.ex_3;

/* Construir um algoritmo para ler dois números inteiros:
    – E imprimir o seu produto. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        double product = n1 * n2;

        System.out.println("O produto dos números é: " + product);
        sc.close();
    }
}

package sem_1.ap.atv_6.ex_3;

/* Leia 5 nomes de pessoas e armazene-os em um vetor.
    - Imprima os nomes do último para o primeiro.
    - Imprima o primeiro e o último nome armazenado */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("\nNomes do último para o primeiro:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println("\nPrimeiro nome: " + names[0]);
        System.out.println("Último nome: " + names[names.length - 1]);
    }
}

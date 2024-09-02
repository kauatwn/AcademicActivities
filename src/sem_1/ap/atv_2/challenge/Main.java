package sem_1.ap.atv_2.challenge;

/* Desenvolver um algoritmo para definir se uma pessoa está apta a votar no Brasil.

Pesquise: Quais são as regras para se votar no Brasil?
    - Identifique quais os dados de entrada necessários para resolver o problema.
    - Identifique quais regras devem ser satisfeitas para definir que uma pessoa está apta a votar.

Faça um programa que pede as informações necessárias e verifica se 	uma pessoa está apta a votar. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int age = sc.nextInt();

        System.out.print("Você é brasileiro? (S/N): ");
        char nationality = sc.next().toUpperCase().charAt(0);

        if (nationality == 'S') {
            if (age >= 18 && age <= 70) {
                System.out.println("Você está apto a votar e o voto é obrigatório para você");
            } else if (age < 16) {
                System.out.println("Você não está apto a votar porque tem menos de 16 anos");
            } else {
                System.out.println("Você está apto a votar, mas o voto é opcional para você");
            }
        } else if (nationality == 'N') {
            System.out.println("Você não está apto a votar porque não é brasileiro.");
        } else {
            System.out.println("Por favor, escolha uma opção válida");
        }

        sc.close();
    }
}

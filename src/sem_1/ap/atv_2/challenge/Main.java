package sem_1.ap.atv_2.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int age = sc.nextInt();

        System.out.print("Você é brasileiro? (S/N): ");
        char nationality = sc.next().toUpperCase().charAt(0);

        switch (nationality) {
            case 'S':
                if (age >= 18 && age <= 70) {
                    System.out.println("Você está apto a votar e o voto é obrigatório para você");
                } else if (age < 16) {
                    System.out.println("Você não está apto a votar porque tem menos de 16 anos");
                } else {
                    System.out.println("Você está apto a votar, mas voto é opcional para você");
                }
                break;
            case 'N':
                System.out.println("Você não está apto a votar porque não é brasileiro.");
                break;
            default:
                System.out.println("Por favor, escolha uma opção válida");
        }

        sc.close();
    }
}

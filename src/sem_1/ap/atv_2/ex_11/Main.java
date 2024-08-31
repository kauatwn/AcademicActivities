package sem_1.ap.atv_2.ex_11;

/* Faça um algoritmo que receba a idade de um nadador e imprima a sua categoria seguindo as regras:

    | Categoria  | Idade           |
    |------------|-----------------|
    | infantilA  | 5 - 7 anos      |
    | infantilB  | 8 - 10 anos     |
    | juvenilA   | 11-13 anos      |
    | juvenilB   | 14-17 anos      |
    | Sênior     | 18 anos ou mais | */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int age = sc.nextInt();

        if (age >= 5 && age <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (age >= 11 && age <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (age >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora das categorias.");
        }

        sc.close();
    }
}

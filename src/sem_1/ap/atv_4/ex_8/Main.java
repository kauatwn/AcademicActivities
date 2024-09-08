package sem_1.ap.atv_4.ex_8;

/* Faça um programa que:
    - Leia duas notas de 5 alunos;
    - Calcule e mostre a média aritmética de cada um deles.

Para cada nota lida:
    - A entrada de cada nota deve ser validada! Ou seja, o programa somente avança se a entrada da nota estiver entre 0
e 10. Caso contrário, solicite-a novamente.
    - Utilize o do-while para validar as notas. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade1, grade2, average;
        int count = 1;

        while (count <= 5) {
            do {
                System.out.printf("Digite a primeira nota do %dº aluno (entre 0 e 10): ", count);
                grade1 = sc.nextDouble();

                if (grade1 < 0 || grade1 > 10) {
                    System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                    System.out.println();
                }
            } while (grade1 < 0 || grade1 > 10);

            do {
                System.out.printf("Digite a segunda nota do %dº aluno (entre 0 e 10): ", count);
                grade2 = sc.nextDouble();

                if (grade2 < 0 || grade2 > 10) {
                    System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                    System.out.println();
                }
            } while (grade2 < 0 || grade2 > 10);

            average = (grade1 + grade2) / 2;
            System.out.printf("A média do %dº aluno é: %.2f%n", count, average);
            System.out.println();

            count++;
        }

        sc.close();
    }
}

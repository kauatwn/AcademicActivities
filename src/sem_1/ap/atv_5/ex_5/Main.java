package sem_1.ap.atv_5.ex_5;

/* Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
    - A média aritmética das duas notas de cada aluno;
    - Forneça a seguinte mensagem de acordo com a nota:
        - REPROVADO se média é menor ou igual a 3;
        - EXAME se média é acima de 3 e menor que 7;
        - APROVADO maior ou igual a 7.
    - O total de alunos aprovados;
    - O total de alunos de exame;
    - O total de alunos reprovados;
    - A média da classe. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int STUDENT_QUANTITY = 6;
        final String INVALID_GRADE = "Nota inválida. Por favor, insira uma nota entre 0 e 10.";

        int totalApproved = 0;
        int totalExam = 0;
        int totalFailed = 0;
        double totalClassAverage = 0.0;

        for (int i = 1; i <= STUDENT_QUANTITY; i++) {
            double grade1;
            double grade2;

            do {
                System.out.printf("Digite a primeira nota do aluno %d: ", i);
                grade1 = sc.nextDouble();

                if (grade1 < 0 || grade1 > 10) {
                    System.out.println(INVALID_GRADE);
                }
            } while (grade1 < 0 || grade1 > 10);

            do {
                System.out.printf("Digite a segunda nota do aluno %d: ", i);
                grade2 = sc.nextDouble();

                if (grade2 < 0 || grade2 > 10) {
                    System.out.println(INVALID_GRADE);
                }
            } while (grade2 < 0 || grade2 > 10);

            double studentAverage = (grade1 + grade2) / 2;
            totalClassAverage += studentAverage;

            String result = String.format("%nMédia do aluno %d: %.2f", i, studentAverage);
            System.out.println(result);

            if (studentAverage <= 3) {
                System.out.printf("Aluno %d: REPROVADO%n", i);
                totalFailed++;
            } else if (studentAverage < 7) {
                System.out.printf("Aluno %d: EXAME%n", i);
                totalExam++;
            } else {
                System.out.printf("Aluno %d: APROVADO%n", i);
                totalApproved++;
            }

            System.out.println();
        }

        sc.close();

        double classAverage = totalClassAverage / STUDENT_QUANTITY;

        System.out.printf("Total de alunos aprovados: %d%n", totalApproved);
        System.out.printf("Total de alunos em exame: %d%n", totalExam);
        System.out.printf("Total de alunos reprovados: %d%n", totalFailed);
        System.out.printf("Média da classe: %.2f", classAverage);
    }
}

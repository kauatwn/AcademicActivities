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

        int totalApproved = 0;
        int totalExam = 0;
        int totalFailed = 0;
        double totalClassAverage = 0.0;

        for (int i = 1; i <= 6; i++) {
            double grade1;
            double grade2;

            String invalidGrade = "Nota inválida. Por favor, insira uma nota entre 0 e 10.";
            do {
                System.out.printf("Digite a primeira nota do aluno %d: ", i);
                grade1 = sc.nextDouble();

                if (grade1 < 0 || grade1 > 10) {
                    System.out.println(invalidGrade);
                }
            } while (grade1 < 0 || grade1 > 10);

            do {
                System.out.printf("Digite a segunda nota do aluno %d: ", i);
                grade2 = sc.nextDouble();

                if (grade2 < 0 || grade2 > 10) {
                    System.out.println(invalidGrade);
                }
            } while (grade2 < 0 || grade2 > 10);

            double studentAverage = (grade1 + grade2) / 2;
            totalClassAverage += studentAverage;

            String result = String.format("%nMédia do aluno %d: %.2f%n", i, studentAverage);
            if (studentAverage <= 3) {
                System.out.println(result);
                System.out.printf("Aluno %d: REPROVADO", i);
                totalFailed++;
            } else if (studentAverage < 7) {
                System.out.println(result);
                System.out.printf("Aluno %d: EXAME", i);
                totalExam++;
            } else {
                System.out.println(result);
                System.out.printf("Aluno %d: APROVADO", i);
                totalApproved++;
            }
        }

        double classAverage = totalClassAverage / 6;

        System.out.printf("Total de alunos aprovados: %d%n", totalApproved);
        System.out.printf("Total de alunos em exame: %d%n", totalExam);
        System.out.printf("Total de alunos reprovados: %d%n", totalFailed);
        System.out.printf("Média da classe: %.2f", classAverage);
    }
}

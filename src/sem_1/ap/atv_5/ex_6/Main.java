package sem_1.ap.atv_5.ex_6;

/* Em uma eleição presidencial, existem quatro candidatos. Os votos são informados através de um código:
    - 1, 2, 3 ou 4 - Voto para o respectivo candidato;
    - 5 - Voto nulo;
    - 6 - Voto em branco.

Faça um algoritmo que leia o voto de 10 eleitores. Calcule e mostre:
    - O total de votos para cada candidato;
    - O total de votos nulos;
    - O total de votos em branco;
    - O percentual dos votos brancos e nulos. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
        int candidate4Votes = 0;
        int nullVotes = 0;
        int blankVotes = 0;
        int totalVotes = 10;
        int option;

        for (int i = 1; i <= totalVotes; i++) {
            System.out.println("URNA ELETRÔNICA");
            System.out.println("Para votar, digite o número apresentado para escolher uma opção e pressione ENTER:\n");
            System.out.println("CANDIDATOS:");
            System.out.println("""
                    [1] - Candidato 1
                    [2] - Candidato 2
                    [3] - Candidato 3
                    [4] - Candidato 4
                    """);

            System.out.println("OUTRAS OPÇÕES:");
            System.out.println("""
                    [5] - Voto nulo
                    [6] - Voto em branco
                    """);
            option = sc.nextInt();
            String voteCounted;

            if (i == totalVotes) {
                voteCounted = "VOTO COMPUTADO! Votação encerrada.\n";
            } else {
                voteCounted = "VOTO COMPUTADO! Vote novamente.\n";
            }

            switch (option) {
                case 1:
                    candidate1Votes++;
                    System.out.println(voteCounted);
                    break;
                case 2:
                    candidate2Votes++;
                    System.out.println(voteCounted);
                    break;
                case 3:
                    candidate3Votes++;
                    System.out.println(voteCounted);
                    break;
                case 4:
                    candidate4Votes++;
                    System.out.println(voteCounted);
                    break;
                case 5:
                    nullVotes++;
                    System.out.println(voteCounted);
                    break;
                case 6:
                    blankVotes++;
                    System.out.println(voteCounted);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, insira uma opção válida entre 1 e 6.");
                    i--;
            }
        }
        double nullPercent = ((double) nullVotes / totalVotes) * 100;
        double blankPercent = ((double) blankVotes / totalVotes) * 100;

        System.out.println("\nRESULTADO DA ELEIÇÃO\n");
        System.out.printf("Candidato 1: %d votos%n", candidate1Votes);
        System.out.printf("Candidato 2: %d votos%n", candidate2Votes);
        System.out.printf("Candidato 3: %d votos%n", candidate3Votes);
        System.out.printf("Candidato 4: %d votos%n", candidate4Votes);
        System.out.printf("Votos nulos: %d votos%n", nullVotes);
        System.out.printf("Votos em branco: %d votos%n", blankVotes);
        System.out.printf("Percentual de votos nulos: %.2f%%%n", nullPercent);
        System.out.printf("Percentual de votos em branco: %.2f%%%n", blankPercent);

        sc.close();
    }
}

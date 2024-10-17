package sem_1.ap.atv_7.ex_6;

import java.util.Scanner;

/* Faça três funções:

    (a) Recebe um vetor de inteiros como entrada e retorna o maior valor.
    (b) Recebe um vetor de inteiros como entrada e retorna o menor valor.
    (c) Recebe um vetor de inteiros como entrada e retorna a média ((max + min) / 2).
    max = maior valor do vetor.
    min = menor valor do vetor.

Obs.: Utilize as duas primeiros funções para fazer a função do item C */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int length = sc.nextInt();
        int[] vetor = new int[length];

        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.printf("Digite o valor da posição %d do vetor: ", i);
            vetor[i] = sc.nextInt();
        }
        sc.close();
        System.out.println();

        int maiorValor = obterMaiorValor(vetor);
        System.out.printf("O maior valor do vetor é: %d", maiorValor);
        System.out.println();

        int menorValor = obterMenorValor(vetor);
        System.out.printf("O menor valor do vetor é: %d", menorValor);
        System.out.println();

        double media = calcularMedia(vetor);
        System.out.printf("A média do maior e menor valor do vetor é: %.2f", media);
        System.out.println();
    }

    public static int obterMaiorValor(int[] vetor) {
        int maior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int obterMenorValor(int[] vetor) {
        int menor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static double calcularMedia(int[] vetor) {
        return (double) (obterMaiorValor(vetor) + obterMenorValor(vetor)) / 2;
    }
}

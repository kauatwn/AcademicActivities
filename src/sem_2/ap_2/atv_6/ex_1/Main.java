package sem_2.ap_2.atv_6.ex_1;

import java.util.Random;
import java.util.Scanner;

// Crie um algoritmo que receba o número de linhas, número de colunas, valor inicial, valor final e preencha uma matriz
// com valores aleatórios dentro da faixa informada. Após preencher a matriz, o algoritmo deverá ordenar a primeira e a
// última coluna da matriz, utilizando um dos algoritmos de ordenação estudados.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int row = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int column = sc.nextInt();

        System.out.print("Digite o valor inicial: ");
        int startValue = sc.nextInt();

        System.out.print("Digite o valor final: ");
        int endValue = sc.nextInt();

        int[][] matrix = new int[row][column];
        fillMatrix(matrix, startValue, endValue);

        System.out.println("Matriz gerada:");
        printMatrix(matrix);

        sortColumn(matrix, 0);
        sortColumn(matrix, matrix[0].length - 1);

        System.out.println("Primeira e última coluna ordenadas:");
        printMatrix(matrix);

        sc.close();
    }

    private static void fillMatrix(int[][] matrix, int startValue, int endValue) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(startValue, endValue + 1);
            }
        }
    }

    private static void printMatrix(int[][] matrix) { // O(n^2) - Quadrática
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%02d", matrix[i][j]);

                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");

            if (i < matrix.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.printf("]%n%n");
    }

    // Insertion Sort
    private static void sortColumn(int[][] matrix, int columnIndex) { // O(n^2) - Quadrática
        for (int i = 1; i < matrix.length; i++) {
            int current = matrix[i][columnIndex];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && matrix[previousIndex][columnIndex] > current) {
                shiftDown(matrix, columnIndex, previousIndex);
                previousIndex--;
            }

            matrix[previousIndex + 1][columnIndex] = current;
        }
    }

    private static void shiftDown(int[][] matrix, int columnIndex, int previousIndex) {
        matrix[previousIndex + 1][columnIndex] = matrix[previousIndex][columnIndex];
    }
}

package sem_2.ap_2.atv_4.ex_5;

import java.util.Random;

// Preencha um array bidimensional de 5x5 com números reais. Em seguida, exiba os valores e posições dos números
// maiores que 50.
public class Main {
    public static void main(String[] args) {
        double[][] matrix = new double[5][5];
        fillMatrix(matrix);

        System.out.println("Números maiores que 50:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 50) {
                    System.out.printf("Posição [%d][%d]: %.2f%n", i, j, matrix[i][j]);
                }
            }
        }
    }

    private static void fillMatrix(double[][] matrix) { // O(n^2) - Quadrática
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) { // O(n) - Linear
            for (int j = 0; j < matrix[i].length; j++) { // O(n) - Linear
                matrix[i][j] = (random.nextDouble() * 200) - 100; // Randomiza valores entre -100 e 100
            }
        }
    }
}

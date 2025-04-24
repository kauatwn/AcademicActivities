package sem_2.ap_2.atv_6.challenge;

import java.util.Random;
import java.util.Scanner;

// Criar um algoritmo que apresente o menu abaixo e suas respectivas funcionalidades:

// 1. Criar a matriz
// 2. Ordenar a diagonal principal
// 3. Ordenar a diagonal secundária
// 4. Buscar um valor na diagonal principal
// 5. Buscar um valor em uma linha específica
// 6. Buscar um valor em uma coluna específica
// 7. Exibir a matriz
// 8. esetar a matriz
// 9. Sair

// Obs.:
// No item 1, deverá ser informada a quantidade de linhas/colunas na matriz. A matriz sempre deverá ser quadrada.
// Os itens 2, 3, 4, 5 e 6 e 7 e 8 só podem ser executados após o item 1 ter sido executado para a criação da matriz.
// Nos itens 2 e 3 deverá ser utilizado um dos algoritmos de ordenação estudados. Um algoritmo diferente em cada método.
// Em algum dos itens deverá ser utilizada recursividade.
// O algoritmo deverá estar protegido contra erros de digitação do usuário (validação de dados).
// No item 8 a matriz deverá ser resetada (voltar a ser nula).
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = null;
        int option;

        do {
            printMenu();
            try {
                option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1 -> {
                        System.out.println("Digite o tamanho N da matriz quadrada (NxN):");
                        int size = sc.nextInt();
                        if (size <= 0) {
                            System.out.println("Tamanho inválido. Digite um número positivo.\n");
                        } else {
                            matrix = new int[size][size];
                            fillMatrix(matrix);
                            System.out.println("Matriz criada com sucesso!\n");
                        }
                    }
                    case 2 -> {
                        if (checkMatrix(matrix)) {
                            sortMainDiagonal(matrix);
                            System.out.println("Diagonal principal ordenada:");
                            printMatrix(matrix, true, false);
                        }
                    }
                    case 3 -> {
                        if (checkMatrix(matrix)) {
                            sortSecondaryDiagonal(matrix);
                            System.out.println("Diagonal secundária ordenada:");
                            printMatrix(matrix, false, true);
                        }
                    }
                    case 4 -> {
                        if (checkMatrix(matrix)) {
                            System.out.println("Digite o valor a ser buscado na diagonal principal:");
                            int target = sc.nextInt();
                            int position = findFirstOccurrenceInMainDiagonal(matrix, target);
                            if (position != -1) {
                                System.out.printf("Valor %d encontrado na posição [%d][%d] da diagonal principal.%n%n",
                                        target, position, position);
                            } else {
                                System.out.printf("Valor %d não encontrado na diagonal principal.%n%n", target);
                            }
                        }
                    }
                    case 5 -> {
                        if (checkMatrix(matrix)) {
                            System.out.printf("Digite o número da linha (0 a %d):%n", matrix.length - 1);
                            int row = sc.nextInt();
                            System.out.println("Digite o valor a ser buscado:");
                            int target = sc.nextInt();
                            int result = findInSpecificRow(matrix, target, row);
                            if (result != -1) {
                                System.out.printf("Valor %d encontrado na linha %d.%n%n", target, row);
                            } else {
                                System.out.printf("Valor %d não encontrado na linha %d.%n%n", target, row);
                            }
                        }
                    }
                    case 6 -> {
                        if (checkMatrix(matrix)) {
                            System.out.printf("Digite o número da coluna (0 a %d):%n", matrix.length - 1);
                            int column = sc.nextInt();
                            System.out.println("Digite o valor a ser buscado:");
                            int target = sc.nextInt();
                            int result = findInSpecificColumn(matrix, target, column);
                            if (result != -1) {
                                System.out.printf("Valor %d encontrado na coluna %d.%n%n", target, column);
                            } else {
                                System.out.printf("Valor %d não encontrado na coluna %d.%n%n", target, column);
                            }
                        }
                    }
                    case 7 -> {
                        if (checkMatrix(matrix)) {
                            System.out.println("Matriz atual:");
                            printMatrix(matrix);
                        }
                    }
                    case 8 -> {
                        matrix = null;
                        System.out.println("Matriz resetada com sucesso!\n");
                    }
                    case 9 -> System.out.println("Encerrando o programa...");
                    default -> System.out.println("Opção inválida. Digite um número entre 1 e 9.\n");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite um número.\n");
                sc.nextLine();
                option = 0;
            }
        } while (option != 9);

        sc.close();
    }

    private static void printMenu() {
        System.out.println("""
                ============ MENU ============
                1. Criar a matriz
                2. Ordenar a diagonal principal
                3. Ordenar a diagonal secundária
                4. Buscar um valor na diagonal principal
                5. Buscar um valor em uma linha específica
                6. Buscar um valor em uma coluna específica
                7. Exibir a matriz
                8. Resetar a matriz
                9. Sair
                =============================
                Escolha uma opção:""");
    }

    private static boolean checkMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("A matriz ainda não foi criada. Crie-a primeiro.\n");
            return false;
        }
        return true;
    }

    private static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        printMatrix(matrix, false, false);
    }

    private static void printMatrix(int[][] matrix, boolean highlightMainDiagonal, boolean highlightSecondaryDiagonal) {
        final String RED = "\u001B[31m";
        final String BLUE = "\u001B[34m";
        final String RESET = "\u001B[0m";

        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < matrix[i].length; j++) {
                final String element = String.format("%02d", matrix[i][j]);

                if (highlightMainDiagonal && i == j) {
                    System.out.printf("%s%s%s", RED, element, RESET);
                } else if (highlightSecondaryDiagonal && (i + j == matrix.length - 1)) {
                    System.out.printf("%s%s%s", BLUE, element, RESET);
                } else {
                    System.out.print(element);
                }

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

    private static void sortMainDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        int[] tempArray = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }

        mergeSort(diagonal, tempArray, 0, diagonal.length - 1);

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = diagonal[i];
        }
    }

    private static void sortSecondaryDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][matrix.length - 1 - i];
        }

        insertionSort(diagonal);

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][matrix.length - 1 - i] = diagonal[i];
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int previousIndex = i - 1;

            while (previousIndex >= 0 && array[previousIndex] > currentValue) {
                shiftRight(array, previousIndex);
                previousIndex--;
            }

            array[previousIndex + 1] = currentValue;
        }
    }

    private static void shiftRight(int[] array, int previousIndex) {
        array[previousIndex + 1] = array[previousIndex];
    }

    private static int findFirstOccurrenceInMainDiagonal(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == target) {
                return i;
            }
        }

        return -1;
    }

    private static int findInSpecificRow(int[][] matrix, int target, int row) {
        if (row < 0 || row >= matrix.length) {
            return -1;
        }

        for (int j = 0; j < matrix[row].length; j++) {
            if (matrix[row][j] == target) {
                return matrix[row][j];
            }
        }

        return -1;
    }

    private static int findInSpecificColumn(int[][] matrix, int target, int column) {
        if (column < 0 || column >= matrix.length) {
            return -1;
        }

        for (int[] row : matrix) {
            if (row[column] == target) {
                return row[column];
            }
        }

        return -1;
    }

    private static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(array, tempArray, left, middle);
            mergeSort(array, tempArray, middle + 1, right);
            merge(array, tempArray, left, middle, right);
        }
    }

    private static void merge(int[] array, int[] tempArray, int left, int middle, int right) {
        int leftIndex = left;
        int rightIndex = middle + 1;
        int mergePosition = left;

        System.arraycopy(array, left, tempArray, left, middle - left + 1);

        while (leftIndex <= middle && rightIndex <= right) {
            if (tempArray[leftIndex] <= array[rightIndex]) {
                array[mergePosition++] = tempArray[leftIndex++];
            } else {
                array[mergePosition++] = array[rightIndex++];
            }
        }

        while (leftIndex <= middle) {
            array[mergePosition++] = tempArray[leftIndex++];
        }
    }
}

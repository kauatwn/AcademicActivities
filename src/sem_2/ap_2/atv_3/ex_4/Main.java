package sem_2.ap_2.atv_3.ex_4;

// Crie um método para realizar a busca binária em um array bidimensional, em que todas as linhas estão ordenadas em
// ordem crescente, e o último item de uma linha é menor que o primeiro item da próxima linha.
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        // Complexidade O(n^2) - Quadrática
        fillArray(array);

        int value = 99;

        // Busca linear logarítmica -> O(n log n)
        int[] coordinates = binarySearch(array, value);

        if (coordinates[0] == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.printf("Valor encontrado na posição [%d, %d]%n", coordinates[0], coordinates[1]);
        }
    }

    private static void fillArray(int[][] array) { // O(n^2)
        int count = 0;
        for (int i = 0; i < array.length; i++) { // O(n)
            for (int j = 0; j < array[i].length; j++) { // O(n)
                array[i][j] = count++;
            }
        }
    }

    private static int[] binarySearch(int[][] matrix, int target) { // Se n = m, então O(n log m) = O(n log n)
        int[] coordinates = { -1, -1 };

        for (int row = 0; row < matrix.length; row++) { // O(n)
            int left = 0;
            int right = matrix[row].length - 1;

            // Se a condição for verdadeira, o valor não está presente na linha.
            // Portanto, passa para a próxima linha (próxima iteração), sem executar o
            // while.
            // Melhora a performance do algoritmo.
            if (matrix[row][right] < target) {
                continue;
            }

            while (left <= right) { // O(log m)
                // // Chance de overflow
                // int middle = (left + right) / 2;

                // Evita overflow
                int middle = left + (right - left) / 2;

                if (matrix[row][middle] == target) {
                    return new int[] { row, middle };
                }

                if (matrix[row][middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return coordinates;
    }
}

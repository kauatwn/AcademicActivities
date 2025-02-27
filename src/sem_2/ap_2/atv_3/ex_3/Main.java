package sem_2.ap_2.atv_3.ex_3;

import java.util.Arrays;

// Crie um programa com um método para realizar busca binária em um array de Strings. Utilize o método compareTo() da
// classe String para realizar a comparação dos valores.
public class Main {
    public static void main(String[] args) {
        String[] array = {
                "Casa", "Carro", "Computador", "Janela", "Livro", "Celular", "Gato", "Cachorro", "Mesa", "Cadeira",
                "Montanha", "Rio", "Praia", "Sol", "Lua", "Estrela", "Céu", "Nuvem", "Chuva", "Relâmpago",
                "Vento", "Flor", "Árvore", "Pedra", "Areia", "Oceano", "Peixe", "Pássaro", "Relógio", "Telefone",
                "Porta", "Quadro", "Papel", "Caneta", "Lápis", "Borracha", "Tesoura", "Teclado", "Monitor", "Câmera",
                "Sapato", "Camisa", "Calça", "Jaqueta", "Boné", "Chapéu", "Brinco", "Colar", "Pulseira", "Anel"
        };

        Arrays.sort(array);

        // Busca binária -> O(log n)
        String value = "Oceano";
        long start = System.currentTimeMillis();
        int binarySearchPosition = binarySearch(array, value);
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;

        System.out.printf("Valor '%s' encontrado na posição %d%n", value, binarySearchPosition);
        System.out.printf("Tempo de execução: %dms%n", elapsedTime);
    }

    private static int binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // // Chance de overflow
            // int middle = (left + right) / 2;

            // Evita overflow
            int middle = left + (right - left) / 2;
            int comparisonResult = array[middle].compareToIgnoreCase(target);

            if (comparisonResult == 0) {
                return middle;
            } else if (comparisonResult < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}

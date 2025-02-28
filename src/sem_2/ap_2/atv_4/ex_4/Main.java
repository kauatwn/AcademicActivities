package sem_2.ap_2.atv_4.ex_4;

import java.util.Random;

// Preencha um array unidimensional com 100 números inteiros. Em seguida, escreva os elementos que são primos e suas
// respectivas posições.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];

        fillArray(array);

        System.out.println("Números primos:");
        for (int i = 0; i < array.length; i++) { // O(n) - Linear
            if (isPrime(array[i])) {
                System.out.printf("Posição [%d]: %d%n", i, array[i]);
            }
        }
    }

    private static void fillArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) { // O(n) - Linear
            array[i] = random.nextInt(1_000);
        }
    }

    private static boolean isPrime(int number) {
        // Números menores que 2 não são primos
        if (number < 2) {
            return false;
        }

        // O número 2 é primo
        if (number == 2) {
            return true;
        }

        // Números pares não são primos, exceto o 2
        if (number % 2 == 0) {
            return false;
        }

        // Verifica divisores ímpares de 3 até a raiz quadrada do número
        // i * i <= number é equivalente a i <= sqrt(number)
        for (int i = 3; i * i <= number; i += 2) { // O(sqrt(n)) - Raiz quadrada
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

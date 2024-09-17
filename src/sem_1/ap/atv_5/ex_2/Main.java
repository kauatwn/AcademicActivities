package sem_1.ap.atv_5.ex_2;

/* Faça um algoritmo que apresente na tela os quadrados dos números inteiros de 15 a 100. Exemplo:
    - O quadrado de 15 é 225
    - O quadrado de 16 é 256
    - ...
    - O quadrado de 100 é 10000 */

public class Main {
    public static void main(String[] args) {
        for (int i = 15; i <= 100; i++) {
            System.out.printf("O quadrado de %d é %d%n", i, i * i);
        }
    }
}

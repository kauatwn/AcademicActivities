package sem_1.ap.atv_4.ex_4;

/*Faça um algoritmo que imprima a metade de cada número de 10 a 20. Exemplo:
    - A metade de 10 é 5.0
    - A metade de 11 é 5.5
    - A metade de 12 é 6.0 */

public class Main {
    public static void main(String[] args) {
        int number = 10;

        do {
            double half = (double) number / 2;

            System.out.println("A metade de " + number + " é " + half);
            number++;
        } while (number <= 20);
    }
}

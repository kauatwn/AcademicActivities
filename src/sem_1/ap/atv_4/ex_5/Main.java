package sem_1.ap.atv_4.ex_5;

// Faça um algoritmo que imprima a tabuada do 5.

public class Main {
    public static void main(String[] args) {
        int number = 5;
        int multiplier = 1;

        while (multiplier <= 10) {
            int result = number * multiplier;

            System.out.printf("%d x %d = %d%n", number, multiplier, result);
            multiplier++;
        }
    }
}

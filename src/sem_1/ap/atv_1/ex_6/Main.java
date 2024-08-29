package sem_1.ap.atv_1.ex_6;

/* Faça um algoritmo que calcule e imprima o valor de cada 	expressão a seguir:
    – (20 - 15) / 2
    – 2 * (5 / 20) + 30 / (15 * 2)
    – 35 / (6 + 2)
    – 23 módulo 4 */

public class Main {
    public static void main(String[] args) {
        double exp1 = (double) (20 - 15) / 2;
        double exp2 = 2 * ((double) 5 / 20) + (double) 30 / (15 * 2);
        double exp3 = (double) 35 / (6 + 2);
        int exp4 = 23 % 4;

        System.out.println("Expressão 1: " + exp1);
        System.out.println("Expressão 2: " + exp2);
        System.out.println("Expressão 3: " + exp3);
        System.out.println("Expressão 4: " + exp4);
    }
}

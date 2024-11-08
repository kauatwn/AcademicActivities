package sem_1.ap.atv_1.ex_9;

/* Faça um algoritmo para apresentar:
    - O cálculo da área de um quadrado de 350 metros de lado.*/

public class Main {
    public static void main(String[] args) {
        double side = 350.0;

        double area = side * side;
        System.out.printf("A área de um quadrado de %.0fm é: %.0fm²", side, area);
    }
}

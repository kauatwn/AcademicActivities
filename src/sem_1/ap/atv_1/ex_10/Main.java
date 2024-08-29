package sem_1.ap.atv_1.ex_10;

/* Construir um algoritmo para imprimir:
    - O cálculo da área de um círculo com raio de 5 cm. (π = 3.14159)
    - Área do círculo = π * r2 */

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 5.0;

        double circleArea = PI * Math.pow(radius, 2);

        System.out.print("Área do círculo: " + circleArea);
    }
}

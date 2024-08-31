package sem_1.ap.atv_2.ex_6;

/* Faça um algoritmo que leia a altura e o sexo de uma pessoa. Calcule e mostre seu peso ideal.
Usar as formulas a seguir para calcular o peso ideal:
    - Para o sexo masculino: (72,7 * altura) - 58.
    - Para o sexo feminino: (62,1 * altura) - 44,7.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double height = sc.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char gender = sc.next().toUpperCase().charAt(0);

        double idealWeight = 0.0;

        switch (gender){
            case 'M':
                idealWeight = (72.7 * height) - 58;
                break;
            case 'F':
                idealWeight = (62.1 * height) - 44.7;
                break;
            default:
                System.out.println("Por favor, digite um genêro válido");
        }

        System.out.printf("O peso ideal é: %.2f kg\n", idealWeight);
        sc.close();
    }
}

package sem_1.ap.atv_4.ex_7;

/* O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma pessoa.
    - Faça um algoritmo que leia a altura e o peso de 10 pessoas.
    - Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem
obesidade.

IMC = peso / altura² */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String UNDERWEIGHT = "abaixo do peso";
        final String OBESITY = "com obesidade";
        final String HEALTHY = "saudável";

        int count = 1;
        int accumulator = 0;

        while (count <= 10) {
            System.out.printf("Digite o peso (em kg) da %dª pessoa: ", count);
            double weight = sc.nextDouble();

            System.out.printf("Digite a altura (em metros) da %dª pessoa: ", count);
            double height = sc.nextDouble();

            double bmi = weight / (height * height);

            String healthStatus;
            if (bmi < 18.5) {
                healthStatus = UNDERWEIGHT;
            } else if (bmi > 24.9) {
                healthStatus = OBESITY;
            } else {
                healthStatus = HEALTHY;
                accumulator++;
            }

            String result = String.format("A %dª pessoa está com IMC em %.2f e está %s.", count, bmi, healthStatus);
            System.out.println(result);

            count++;
            System.out.println();
        }

        sc.close();

        System.out.println("Número de pessoas saudáveis com IMC entre 18,5 e 24,9: " + accumulator);
    }
}

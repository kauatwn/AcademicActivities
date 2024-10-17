package sem_1.ap.atv_7.ex_7;

import java.util.Scanner;

/* Criar um método chamado calcularFatorial:
    - Recebe um número inteiro.
    - Retorna o fatorial calculado.

Exemplo:

Fatorial 3 = 6.
Fatorial 5 = 120.

Teste seu programa:
    - Leia um número do usuário.
    - Apresente o fatorial desse número. */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        int fatorial = calcularFatorial(numero);
        System.out.printf("O fatorial de %d é: %d", numero, fatorial);
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}

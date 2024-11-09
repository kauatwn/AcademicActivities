package sem_1.ap.atv_2.ex_8;

/* Faça um algoritmo que verifique a validade de uma senha 	fornecida pelo usuário.
    - Sabendo que a senha é R10p5:
        - Imprimir mensagem de "acesso concedido" ou "acesso negado".

Para comparar duas Strings utilizar o método equals(). Ele retorna um valor booleano. Exemplo:
    - if(senha.equals("R10p5")) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String CORRECT_PASSWORD = "R10p5";

        System.out.print("Digite a senha: ");
        String inputPassword = sc.nextLine();

        if (inputPassword.equals(CORRECT_PASSWORD)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }
}

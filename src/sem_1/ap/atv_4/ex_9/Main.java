package sem_1.ap.atv_4.ex_9;

/* Dado o cardápio de uma lanchonete:

    | Código |      Produto      | Preço    |
    |--------|-------------------|----------|
    | 100    | Cachorro-quente   | R$ 1,20  |
    | 101    | Bauru simples     | R$ 1,30  |
    | 102    | Bauru com ovo     | R$ 1,50  |
    | 103    | Hambúrguer        | R$ 1,20  |
    | 104    | Cheeseburger      | R$ 1,30  |
    | 105    | Refrigerante      | R$ 1,00  |

    - Faça um algoritmo que leia o código do produto e a quantidade que o cliente deseja comprar.
    - O cliente pode comprar mais de um produto, pergunte se ele deseja continuar comprando.
    - Calcule o valor total a ser pago por cada produto e o valor total da compra. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double HOT_DOG_PRICE = 1.20;
        final double SIMPLE_BAURU_PRICE = 1.30;
        final double BAURU_WITH_EGG_PRICE = 1.50;
        final double HAMBURGER_PRICE = 1.20;
        final double CHEESEBURGER_PRICE = 1.30;
        final double SODA_PRICE = 1.00;

        boolean continueBuying = true;
        double totalValue = 0.0;

        do {
            System.out.println("""
                    | Código |      Produto      | Preço    |
                    |--------|-------------------|----------|
                    | 100    | Cachorro-quente   | R$ 1,20  |
                    | 101    | Bauru simples     | R$ 1,30  |
                    | 102    | Bauru com ovo     | R$ 1,50  |
                    | 103    | Hambúrguer        | R$ 1,20  |
                    | 104    | Cheeseburger      | R$ 1,30  |
                    | 105    | Refrigerante      | R$ 1,00  |
                    """);

            System.out.print("Digite o código do produto: ");
            int productCode = sc.nextInt();

            System.out.print("Digite a quantidade: ");
            int quantity = sc.nextInt();

            double productValue = switch (productCode) {
                case 100 -> HOT_DOG_PRICE * quantity;
                case 101 -> SIMPLE_BAURU_PRICE * quantity;
                case 102 -> BAURU_WITH_EGG_PRICE * quantity;
                case 103 -> HAMBURGER_PRICE * quantity;
                case 104 -> CHEESEBURGER_PRICE * quantity;
                case 105 -> SODA_PRICE * quantity;
                default -> {
                    System.out.println("Código inválido. Por favor, digite um código válido.");
                    yield 0.0;
                }
            };

            totalValue += productValue;
            System.out.println();

            System.out.print("Deseja continuar comprando (S/N)? ");
            char answer = sc.next().toUpperCase().charAt(0);
            System.out.println();

            if (answer != 'S') {
                continueBuying = false;
            }
        } while (continueBuying);

        sc.close();

        System.out.printf("Valor total a pagar: R$ %.2f", totalValue);
    }
}

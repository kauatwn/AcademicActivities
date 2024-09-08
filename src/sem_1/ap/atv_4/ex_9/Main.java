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

        double hotDogPrice = 1.20;
        double simpleBauruPrice = 1.30;
        double bauruWithEggPrice = 1.50;
        double hamburgerPrice = 1.20;
        double cheeseburgerPrice = 1.30;
        double sodaPrice = 1.00;

        boolean continueBuying = true;
        double totalValue = 0.0;
        double productValue = 0.0;

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

            switch (productCode) {
                case 100:
                    productValue = hotDogPrice * quantity;
                    break;
                case 101:
                    productValue = simpleBauruPrice * quantity;
                    break;
                case 102:
                    productValue = bauruWithEggPrice * quantity;
                    break;
                case 103:
                    productValue = hamburgerPrice * quantity;
                    break;
                case 104:
                    productValue = cheeseburgerPrice * quantity;
                    break;
                case 105:
                    productValue = sodaPrice * quantity;
                    break;
                default:
                    System.out.println("Código inválido.");
            }

            totalValue += productValue;
            System.out.print("Deseja continuar comprando (S/N)? ");
            char answer = sc.next().toUpperCase().charAt(0);

            if (answer != 'S') {
                continueBuying = false;
            }
        } while (continueBuying);

        System.out.println("Valor total a pagar: R$ " + totalValue);
        sc.close();
    }
}

package sem_1.ap.atv_2.ex_6;

/* Dado o cardápio de uma lanchonete:

    | Código |      Produto      | Preço    |
    |--------|-------------------|----------|
    | 100    | Cachorro-quente   | R$ 1,20  |
    | 101    | Bauru simples     | R$ 1,30  |
    | 102    | Bauru com ovo     | R$ 1,50  |
    | 103    | Hambúrguer        | R$ 1,20  |
    | 104    | Cheeseburger      | R$ 1,30  |
    | 105    | Refrigerante      | R$ 1,00  |

Faça um algoritmo que:
    - Leia o código do produto e a quantidade;
    - Calcule o valor a ser pago pelo cliente;
    - Imprimir o valor a ser pago;
    - Imprimir o nome do produto. */

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

        double totalValue = 0.0;
        String productName = "";

        switch (productCode) {
            case 100:
                totalValue = hotDogPrice * quantity;
                productName = "Cachorro-quente";
                break;
            case 101:
                totalValue = simpleBauruPrice * quantity;
                productName = "Bauru simples";
                break;
            case 102:
                totalValue = bauruWithEggPrice * quantity;
                productName = "Bauru com ovo";
                break;
            case 103:
                totalValue = hamburgerPrice * quantity;
                productName = "Hambúrguer";
                break;
            case 104:
                totalValue = cheeseburgerPrice * quantity;
                productName = "Cheeseburger";
                break;
            case 105:
                totalValue = sodaPrice * quantity;
                productName = "Refrigerante";
                break;
            default:
                System.out.println("Código de produto inválido.");
                sc.close();
        }

        System.out.println("Produto: " + productName);
        System.out.println("Valor a pagar: R$ " + totalValue);
        sc.close();
    }
}

# Exercícios de Estrutura Condicional

Nesta pasta, contém uma série de exercícios acadêmicos desenvolvidos para praticar e entender conceitos fundamentais sobre estrutura condicional.

## Objetivo

- **Condicional Simples:** Utiliza uma única condição para executar um bloco de código. Ideal para situações onde apenas uma condição precisa ser verificada. Exemplo:

    ```java
    public class Jogo {
        public static void main(String[] args) {
            int pontos;

            pontos = 1000;

            if (pontos >= 1000) {
                System.out.println("Você passou para a fase 2!!!");
            }

            System.out.println("Próxima instrução!");
        }
    }
    ```

- **Condicional Composta:** Envolve uma condição e um bloco de código a ser executado caso a condição seja verdadeira, e um bloco alternativo a ser executado caso seja falsa. Utilizada para situações onde são necessárias duas alternativas de fluxo. Exemplo:

    ```java
    public class ParImpar {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int num;

            System.out.println("Digite um número: ");
            num = entrada.nextInt();

            if ((num % 2) == 0) {
                System.out.println(num + " = par");
            } else {
                System.out.println(num + " = ímpar");
            }

            entrada.close();
        }
    }
    ```

- **Condicional Encadeada:** Permite verificar múltiplas condições em sequência, utilizando estruturas. Ideal para situações onde múltiplas condições precisam ser avaliadas em sequência para determinar o fluxo do programa. Exemplo:

    ```java
    import java.util.Scanner;

    public class JogoAdivinha {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int palpite;
            
            System.out.println("Digite seu palpite");
            palpite = entrada.nextInt();
            
            if (palpite == 15) {
                System.out.println("Você acertou!!!");
            } else if (palpite < 15) {
                System.out.println("Seu palpite está abaixo!!!");
            } else {
                System.out.println("Seu palpite está acima");
            }
            
            entrada.close();
        }
    }
    ```
# Exercícios de Estrutura Condicional

Nesta pasta, contém uma série de exercícios acadêmicos desenvolvidos para praticar e entender conceitos fundamentais sobre estrutura condicional.

## Objetivo

- **Switch Case:** Utilizado para simplificar a verificação de múltiplas condições baseadas em um mesmo valor. É uma alternativa mais organizada para múltiplas instruções `if-else`. Exemplo:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Menu de opções ====");
        System.out.println("1 - Cadastrar produtos");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Sair do sistema");
        System.out.println("==== Escolha uma opção ====");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Você escolheu a opção 1");
                System.out.println("Que é a opção cadastrar produtos");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                System.out.println("Que é a opção listar produtos");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("Que é a opção sair do sistema");
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}
```

- **Switch Expressions (Java 12+):** A partir do Java 12, o switch pode ser utilizado como uma expressão, tornando o código mais conciso. Exemplo:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Menu de opções ====");
        System.out.println("1 - Cadastrar produtos");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Sair do sistema");
        System.out.println("==== Escolha uma opção ====");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Você escolheu a opção 1");
                System.out.println("Que é a opção cadastrar produtos");
            }
            case 2 -> {
                System.out.println("Você escolheu a opção 2");
                System.out.println("Que é a opção listar produtos");
            }
            case 3 -> {
                System.out.println("Você escolheu a opção 3");
                System.out.println("Que é a opção sair do sistema");
            }
            default -> System.out.println("Opção inválida");
        }

        sc.close();
    }
}
```

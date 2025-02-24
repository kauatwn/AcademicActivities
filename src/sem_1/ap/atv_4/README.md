# Exercícios de Estrutura Condicional

Nesta pasta, contém uma série de exercícios acadêmicos desenvolvidos para praticar e entender conceitos fundamentais sobre estrutura condicional.

## Objetivo

- **Laço while:** O laço `while` é utilizado para repetir um bloco de código enquanto uma condição específica for verdadeira. A condição é verificada antes da execução do bloco, o que significa que, se a condição for falsa desde o início, o bloco de código não será executado nenhuma vez. Exemplo:

```java
public class Main {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 100) {
            System.out.println(count + " ");
            count++;
        }
    }
}
```

- **Laço do-while:** O laço `do-while` é semelhante ao `while`, mas com uma diferença crucial: o bloco de código é executado pelo menos uma vez, mesmo que a condição seja falsa, pois a verificação da condição ocorre após a execução do bloco. Exemplo:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade;

        do {
            System.out.print("Digite uma nota: ");
            grade = sc.nextDouble();
        } while (grade < 0 || grade > 10);

        System.out.println("Nota correta!");

        sc.close();
    }
}
```

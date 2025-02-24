# Exercícios de Arrays Multidimensionais

Nesta pasta, contém uma série de exercícios acadêmicos desenvolvidos para praticar e entender conceitos fundamentais sobre arrays multidimensionais.

## Objetivo

- **Arrays Multidimensionais:** Entender a criação, manipulação e exibição de arrays com mais de uma dimensão, como arrays bidimensionais (matrizes), tridimensionais e quadridimensionais. Exemplo de array bidimensional:

```java
package array;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][10];

        preencher(matriz);
        imprimir(matriz);
    }

    private static void preencher(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
    }

    private static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%02d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
```

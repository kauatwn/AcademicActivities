# Exercícios de Busca Sequencial

Nesta pasta, contém uma série de exercícios acadêmicos desenvolvidos para praticar e entender conceitos fundamentais sobre busca sequencial em arrays.

## Objetivo

- **Busca Sequencial:** Algoritmo simples para encontrar um valor em um array, percorrendo cada elemento até encontrar o valor desejado. Exemplo:

```java
import java.util.Random;
import java.util.Scanner;

public class ExemploBuscas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdElem, valorProc;
        int[] vetor;
        long inicio, fim, duracao;

        System.out.println("Informe o número de elementos do vetor");
        qtdElem = sc.nextInt();

        vetor = new int[qtdElem];
        preencher(vetor);

        System.out.println("Qual valor deseja buscar no vetor?");
        valorProc = sc.nextInt();

        inicio = System.currentTimeMillis();

        if (buscar(valorProc, vetor)) {
            System.out.println("\u001B[32mValor encontrado!!!");
        } else {
            System.out.println("\u001B[31mValor não encontrado!!!");
        }

        fim = System.currentTimeMillis();
        duracao = fim - inicio;

        System.out.printf("Tempo de duração: %d milisegundos", duracao);
    }

    private static void preencher(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(0, 1000);
        }
    }

    private static boolean buscar(int numero, int[] vetor) {
        boolean achou = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                achou = true;
                break;
            }
        }

        return achou;
    }
}
````

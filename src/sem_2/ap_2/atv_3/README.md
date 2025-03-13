# Exercícios de Busca Sequencial e Binária

Nesta pasta, contém uma série de exercícios acadêmicos desenvolvidos para praticar e entender conceitos fundamentais sobre busca sequencial e binária em arrays.

## Objetivo

- **Busca Sequencial:** Algoritmo simples para encontrar um valor em um array, percorrendo cada elemento até encontrar o valor desejado. Exemplo:

```java
private static int buscaLinear(int[] array, int valor) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == valor) {
            posicao = i;
            break;
        }
    }

    return -1;
}
```

- **Busca Binária:** Algoritmo eficiente para encontrar um valor em um array **ordenado**, dividindo repetidamente o intervalo de busca ao meio. Exemplo:

```java
private static int buscaBinaria(int[] array, int valor) {
    int meio, inicio = 0, fim = array.length - 1;

    while (inicio <= fim) {
        meio = (inicio + fim) / 2;
        
        if (array[meio] > valor) {
            fim = meio - 1;
        } else if (array[meio] < valor) {
            inicio = meio + 1;
        } else {
            return meio;
        }
    }

    return -1;
}
```

package sem_2.ap_2.atv_2.ex_3;

// Crie um programa com um método que realize a busca sequencial de um valor em um array de char e retorne o índice da
// última ocorrência deste valor no array.
public class Main {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'a', 'd'};
        char value = 'a';

        int lastOccurrence = findLastOccurrence(array, value);
        if (lastOccurrence != -1) {
            System.out.printf("Última ocorrência do caractere %c no array na posição: %d%n", value, lastOccurrence);
        } else {
            System.out.println("Caractere não encontrado.");
        }
    }

    private static int findLastOccurrence(char[] array, char value) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}

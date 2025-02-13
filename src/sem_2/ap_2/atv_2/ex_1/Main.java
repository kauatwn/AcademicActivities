package sem_2.ap_2.atv_2.ex_1;

// Crie um programa com um método que realize a busca sequencial de um valor em um array de Strings e retorne a posição
// do valor encontrado.
public class Main {
    public static void main(String[] args) {
        String[] array = {"França", "Brasil", "Colômbia", "Itália", "Espanha"};
        String value = "Itália";

        int foundPosition = findPosition(array, value);
        if (foundPosition != -1) {
            System.out.printf("O país %s foi encontrado na posição %d%n", value, foundPosition);
        } else {
            System.out.printf("O país '%s' não foi encontrado no array.", value);
        }
    }

    private static int findPosition(String[] array, String value) {
        int position = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                position = i;
                break;
            }
        }

        return position;
    }
}

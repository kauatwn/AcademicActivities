package sem_2.ap_2.atv_4.ex_1;

// Crie um método que verifica se um array possui um determinado valor.
public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int value = 3;

        if (hasValue(array, value)) {
            System.out.printf("O array possui o valor %d", value);
        } else {
            System.out.printf("O array não possui o valor %d", value);
        }
    }

    private static boolean hasValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }

        return false;
    }
}

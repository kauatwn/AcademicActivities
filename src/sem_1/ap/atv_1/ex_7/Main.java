package sem_1.ap.atv_1.ex_7;

/* Faça um algoritmo para imprimir em cada linha o resultado lógico das seguintes expressões:
    – ((120 - 30) = (3 * 30))
    – (não ((20 módulo 4) = 1) ou (9 != 9))
    - ((5 módulo 2 ) > 3)
    - (a = A)

Obs.: O resultado deve ser True ou False */

public class Main {
    public static void main(String[] args) {
        if (120 - 30 == 3 * 30) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (!(20 % 4 == 1) || 9 != 9) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (5 % (2 / 2) > 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if ("a" == "A") {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

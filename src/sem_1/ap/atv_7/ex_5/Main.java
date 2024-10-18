package sem_1.ap.atv_7.ex_5;

/* Escreva o método exibirDiaSemana().
    - Deve receber um número inteiro no intervalo de 1 - 7 como parâmetro.
    - Deve retornar uma String com o dia da semana correspondente aquele número.

Caso seja passado um número fora do intervalo de 1-7:
    - Retorne uma String com a mensagem: "Dia da semana inválido".

Exemplo:

    - 1 = domingo
    - 2 = segunda
    - 3 = terça

Obs.: Utilize o switch case dentro do seu método. */

public class Main {
    public static void main(String[] args) {
        System.out.println(exibirDiaSemana(1));
        System.out.println(exibirDiaSemana(2));
        System.out.println(exibirDiaSemana(3));
        System.out.println(exibirDiaSemana(4));
        System.out.println(exibirDiaSemana(5));
        System.out.println(exibirDiaSemana(6));
        System.out.println(exibirDiaSemana(7));
        System.out.println(exibirDiaSemana(8));
    }

    public static String exibirDiaSemana(int dia) {
        return switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia da semana inválido";
        };
    }
}

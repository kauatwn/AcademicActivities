package sem_1.ap.atv_7.ex_2;

/* Faça uma função chamada imprimeNovaMensagem(). Sua função deve receber uma String como parâmetro de entrada e deve
imprimir a seguinte mensagem:

    "Meu primeiro programa com funções e parametro: <parametro>".

    - Chame a sua função três vezes de dentro do método main e passe um valor diferente como parâmetro para cada chamada
da função. */

public class Main {
    public static void main(String[] args) {
        imprimeNovaMensagem("primeira chamada");
        imprimeNovaMensagem("segunda chamada");
        imprimeNovaMensagem("terceira chamada");
    }

    public static void imprimeNovaMensagem(String parametro) {
        System.out.println("Meu primeiro programa com funções e parametro: " + parametro);
    }
}

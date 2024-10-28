package sem_1.ap.atv_8.ex_1;

/* Instancie dois objetos Carro na classe que possui o método main()
    - Um Honda Civic preto
    - Uma Ferrari vermelha */

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.marca = "Honda";
        carro1.modelo = "Civic";
        carro1.velocidadeMaxima = 200;
        carro1.cor = "Preto";

        Carro carro2 = new Carro();

        carro2.marca = "Ferrari";
        carro2.modelo = "488 GTB";
        carro2.velocidadeMaxima = 330;
        carro2.cor = "Vermelho";
    }
}

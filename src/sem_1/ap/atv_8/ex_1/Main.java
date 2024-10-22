package sem_1.ap.atv_8.ex_1;

/* Instancie dois objetos Carro na classe que possui o método main()
    - Um Honda Civic preto
    - Uma Ferrari vermelha */

public class Main {
    public static void main(String[] args) {
        Carro honda = new Carro("Honda", "Civic", 200, "Preto");
        Carro ferrari = new Carro("Ferrari", "488 GTB", 330, "Vermelho");

        System.out.println(honda.getMarca());
        System.out.println(honda.getModelo());
        System.out.println(honda.getVelocidadeMaxima());
        System.out.println(honda.getCor());

        System.out.println(ferrari.getMarca());
        System.out.println(ferrari.getModelo());
        System.out.println(ferrari.getVelocidadeMaxima());
        System.out.println(ferrari.getCor());
    }
}

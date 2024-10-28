package sem_1.ap.atv_8.ex_2;

/* Instancie 4 objetos Ponto (p1, p2, p3 e p4)

Coloque valores aos atributos dos pontos:
    p1 = (0, 0)
    p2 = (2, 0)
    p3 = (0, 2)
    p4 = (2, 2) */

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        p1.coordenadaX = 0;
        p1.coordenadaY = 0;

        Ponto p2 = new Ponto();
        p2.coordenadaX = 2;
        p2.coordenadaY = 0;

        Ponto p3 = new Ponto();
        p3.coordenadaX = 0;
        p3.coordenadaY = 2;

        Ponto p4 = new Ponto();
        p4.coordenadaX = 2;
        p4.coordenadaY = 2;
    }
}

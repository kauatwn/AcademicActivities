package sem_1.ap.atv_8.ex_1;

/* Faça uma classe Carro que possua os seguintes atributos:
    - marca
    - modelo
    - velocidadeMaxima
    - cor */

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeMaxima;
    private String cor;

    public Carro(String marca, String modelo, double velocidadeMaxima, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

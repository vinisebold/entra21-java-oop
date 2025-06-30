package exer_7;

public class Aeronave {
    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double queimaCombustivelMin;


    public Aeronave(String modelo, int passageiros, double velocidadeMaxima, double queimaCombustivelMin) {
        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.queimaCombustivelMin = queimaCombustivelMin;
    }
}

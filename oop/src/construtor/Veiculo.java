package construtor;

public class Veiculo {

    // Atributos de classe
    String modelo;
    double comprimento;
    int passageiros;
    int velMax;
    String cor;

    // Construtor
    public Veiculo(String modelo, double comprimento, int passageiros, int velMax, String cor) {
        this.modelo = modelo;
        this.comprimento = comprimento;
        this.passageiros = passageiros;
        this.velMax = velMax;
        this.cor = cor;
    }
}

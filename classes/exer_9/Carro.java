package exer_9;

public class Carro {

    // Variável
    private int velocidade;

    // Construtor
    public Carro(int velocidade) {
        setVelocidade(velocidade);
    }

    // Setter
    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Getter
    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int velocidade) {
        if (velocidade >= 0 && velocidade < 20) {
            setVelocidade(getVelocidade() + velocidade);
        } else {
            throw new IllegalArgumentException("Valor fora do padrão");
        }
    }

    public void reduzir(int velocidade) {
        if (velocidade >= 0 && velocidade < 30) {
            setVelocidade(getVelocidade() - velocidade);
        } else {
            throw new IllegalArgumentException("Valor fora do padrão");
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }
}

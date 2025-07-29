package her_01;

public class Circulo {
    private String cor;
    private double raio;

    public Circulo(String cor, double raio) {
        setCor(cor);
        setRaio(raio);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

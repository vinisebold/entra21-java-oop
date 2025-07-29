package her_01;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(String cor, double raio, double altura) {
        super(cor, raio);
        setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolume() {
        return calcularArea() * altura;
    }
}

package her_01;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo("Marrom", 2);

        System.out.println(circulo1.calcularArea());

        Cilindro cilindro1 = new Cilindro("vermelho", 3, 5);

        System.out.println(cilindro1.calcularVolume());
    }
}

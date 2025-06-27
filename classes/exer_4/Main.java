package exer_4;

public class Main {
    public static void main(String[] args) {

        // Cria objeto
        Circulo c1 = new Circulo();
        c1.raio = 5;

        Circulo c2 = new Circulo();
        c2.raio = 10;

        Circulo c3 = new Circulo();
        c3.raio = 13;

        Circulo c4 = new Circulo();
        c4.raio = 8;

        Circulo c5 = new Circulo();
        c5.raio = 2;

        // Output
        System.out.println("Área dos circulos: ");
        System.out.println(c1.calcularArea());
        System.out.println(c2.calcularArea());
        System.out.println(c3.calcularArea());
        System.out.println(c4.calcularArea());
        System.out.println(c5.calcularArea());


    }
}

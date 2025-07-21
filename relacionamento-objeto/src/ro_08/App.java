package ro_08;

public class App {
    public static void main(String[] args) {
        Computador computador1 = new Computador("SN001", "Intel Core i7-13700KF", 5.4, 512, 16, 500, 850);
        Computador computador2 = new Computador("SN001", "AMD Ryzen 9 5950X", 4.9, 1024, 32, 500, 1000);
        Computador computador3 = new Computador("SN003", "Intel Core i5-9400F", 4.1, 256, 8, 400, 600);

        Laboratorio laboratorio = new Laboratorio();

        laboratorio.addComputador(computador1);
        laboratorio.addComputador(computador2);
        laboratorio.addComputador(computador3);

        System.out.println("Armazenamento total: " + laboratorio.obterArmazenamentoTotal());

        computador1.fazerOverclockProcessador(400);
    }
}

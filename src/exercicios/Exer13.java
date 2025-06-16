package exercicios;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Informe a largura: ");
        double largura = sc.nextDouble();

        System.out.println("Perímetro: " + calcularPerimetro(altura, largura));
        System.out.println("Perímetro: " + calcularArea(altura, largura));
        // Fecha Scanner
        sc.close();
    }

    public static double calcularPerimetro(double altura, double largura) {
        return 2 * (altura + largura);
    }

    public static double calcularArea(double altura, double largura) {
        return altura * largura;
    }
}

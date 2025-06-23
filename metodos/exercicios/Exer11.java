package exercicios;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("[1] Informe número: ");
        double num1 = sc.nextDouble();
        System.out.print("[2] Informe número: ");
        double num2 = sc.nextDouble();

        // Encontrar maior valor ou valor igual
        System.out.println("\nResultado: " + encontrarMaiorNumero(num1, num2));

        // Fecha Scanner
        sc.close();
    }

    public static double encontrarMaiorNumero(double num1, double num2) {
        if (num1 == num2) {
            return num1 + num2;
        } else {
            return Math.max(num1, num2);
        }
    }
}

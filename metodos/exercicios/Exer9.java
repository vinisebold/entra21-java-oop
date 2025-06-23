package exercicios;

import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe número 1: ");
        double num1 = sc.nextDouble();
        System.out.print("Informe número 2: ");
        double num2 = sc.nextDouble();
        System.out.print("Informe número 3: ");
        double num3 = sc.nextDouble();
        System.out.print("Informe número 4: ");
        double num4 = sc.nextDouble();

        // Processamento e Output
        System.out.println("Resultado da soma: " + calculaSomaNumeros(num1, num2, num3, num4));

        // Fecha Scanner
        sc.close();
    }

    public static double calculaSomaNumeros(double pNum1, double pNum2, double pNum3, double pNum4) {
        return pNum1 + pNum2 + pNum3 + pNum4;
    }
}

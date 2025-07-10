package exercicios;

import java.util.Scanner;

public class Exer6 {
    public static void imprimirNumeroPerto(double numBase) {
        // Inicializa Scanner
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe número 1: ");
        double num1 = input.nextDouble();

        System.out.print("Informe número 2: ");
        double num2 = input.nextDouble();

        // Processamento e Output
        double diferencaNum1 = Math.abs(numBase - num1);
        double diferencaNum2 = Math.abs(numBase - num2);


        if (diferencaNum1 <= diferencaNum2) {
            System.out.println("\nO número mais próximo de " + numBase + " é " + num1);
        } else {
            System.out.println("\nO número mais próximo de " + numBase + " é " + num2);
        }

        // Fecha Scanner
        input.close();

    }

    public static void main(String[] args) {
        // Inicializa Scanner
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o número \"base\": ");
        double numBase = input.nextDouble();

        // Processamento
        imprimirNumeroPerto(numBase);

        // Fecha Scanner
        input.close();
    }

}

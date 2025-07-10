package exercicios;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o número: ");
        double numInformado = sc.nextDouble();

        System.out.println("Resultado: " + calcularNumero(numInformado));

        // Fecha Scanner
        sc.close();
    }
    public static double calcularNumero(double num){
        if (num % 2 == 0){
            return Math.pow(num, 2);
        } else {
            return num * 2;
        }
    }
}

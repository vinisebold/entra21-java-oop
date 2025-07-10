package exercicios;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o número 1: ");
        int num1 = input.nextInt();
        System.out.print("Informe o número 2: ");
        int num2 = input.nextInt();

        // Processamento e Output
        processamentoNumero(num1, num2);

        // Fecha Scanner
        input.close();
    }

    public static void processamentoNumero(int num1, int num2) {

        //
        if ((num1 == 5 && num2 == 5) || ((num1 + num2) == 5) || ((num1 - num2) == 5)) {
            System.out.println(Math.pow(num1, 3));
            System.out.println(Math.pow(num2, 3));
        } else {
            System.out.println(Math.pow(num1, 2));
            System.out.println(Math.pow(num2, 2));
        }
    }
}

package exercicios;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("1° Nota: ");
        double nota1 = sc.nextInt();
        System.out.print("2° Nota: ");
        double nota2 = sc.nextInt();
        System.out.print("3° Nota: ");
        double nota3 = sc.nextInt();

        System.out.println("\nMédia das notas informadas: " + calcularMedia(nota1, nota2, nota3));

        // Fecha Scanner
        sc.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}

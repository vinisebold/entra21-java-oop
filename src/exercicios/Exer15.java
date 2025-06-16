package exercicios;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira o limite máximo: ");
        int limiteMaximo = sc.nextInt();

        System.out.print("Insira o limite mínimo: ");
        int limiteMinimo = sc.nextInt();

        System.out.print("Informe o valor: ");
        int numeroInformado = sc.nextInt();

        System.out.println(verificarLimiteNumero(limiteMaximo, limiteMinimo, numeroInformado));

        // Fecha Scanner
        sc.close();
    }

    public static String verificarLimiteNumero(int pLimiteMaximo, int pLimiteMinimo, int pNumero) {

        String resultado;

        if (pNumero > pLimiteMaximo || pNumero < pLimiteMinimo) {
            resultado = (pNumero + " está fora dos limites impostos.");
        } else {
            resultado = (pNumero + " está dentro dos limites impostos.");
        }

        return resultado;
    }
}

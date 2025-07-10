package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Declara ArrayList (vetor dinâmico)
        ArrayList<Double> arrayNumeros = new ArrayList<Double>();
        String entrada;

        // Entrada de dados

        while (true) {
            System.out.print("\nInforme um número (ou digite 'sair' para encerrar): ");
            entrada = sc.next();

            if (entrada.equalsIgnoreCase("sair")){
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                arrayNumeros.add(numero);
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida. Digite um número ou \"Sair\".");
            }
        }

        System.out.println("Maior elemento: " + verificarMaiorElemento(arrayNumeros));
        System.out.println("Menor elemento: " + verificarMenorElemento(arrayNumeros));
        System.out.println("Média Array: " + verificarMediaElementos(arrayNumeros));

        // Fecha Scanner
        sc.close();
    }

    public static double verificarMaiorElemento(ArrayList<Double> arrayNumero) {
        double maiorNumero = Double.MIN_VALUE;

        for (int i = 0; i < arrayNumero.size(); i++) {
            if (arrayNumero.get(i) > maiorNumero) {
                maiorNumero = arrayNumero.get(i);
            }
        }
        return maiorNumero;
    }

    public static double verificarMenorElemento(ArrayList<Double> arrayNumero) {
        double menorNumero = Double.MAX_VALUE;

        for (int i = 0; i < arrayNumero.size(); i++) {
            if (arrayNumero.get(i) < menorNumero) {
                menorNumero = arrayNumero.get(i);
            }
        }
        return menorNumero;
    }

    public static double verificarMediaElementos(ArrayList<Double> arrayNumero) {
        double somaArray = 0;

        for (int i = 0; i < arrayNumero.size(); i++) {
            somaArray += arrayNumero.get(i);
        }

        return somaArray / arrayNumero.size();
    }
}

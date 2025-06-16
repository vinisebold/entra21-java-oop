package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Declara ArrayList (vetor dinâmico)
        ArrayList<Double> arrayNumeros = new ArrayList<Double>();

        // Entrada de dados
        boolean fimPrograma = false;
        while (!fimPrograma) {
            System.out.print("\nInforme um número: ");
            arrayNumeros.add(sc.nextDouble());

            System.out.print("Deseja adicionar outro valor? (S/N): ");
            char finalizarPrograma = sc.next().toUpperCase().charAt(0);
            if (finalizarPrograma == 'N') {
                fimPrograma = true;
            }
        }

        System.out.println(verificarMaiorElemento(arrayNumeros));

        // Fecha Scanner
        sc.close();
    }

    public static double verificarMaiorElemento(ArrayList<Double> arrayNumero) {

    }
}

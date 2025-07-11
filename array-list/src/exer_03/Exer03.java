package exer_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia ArrayList
        List<Integer> listaElementos = new ArrayList<Integer>();

        // Variavel de input
        int input = 1;

        while (input != 0) {
            System.out.print("Informe: ");
            input = sc.nextInt();

            if (input == 0) {
                break;
            }

            listaElementos.add(input);
        }

        System.out.println("Menor elemento: " + Collections.min(listaElementos));
        System.out.println("Maior elemento: " + Collections.max(listaElementos));
        System.out.println("Média: " + calcularMedia(listaElementos));

    }

    public static double calcularMedia(List<Integer> listaElementos){
        double soma = 0;
        for (Integer integer : listaElementos) {
            soma += integer;
        }

        return soma / listaElementos.size();
    }
}

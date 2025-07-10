package exer_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia ArrayList
        ArrayList<Integer> array = new ArrayList<Integer>();

        // Variavel de input
        int input = 1;

        while (input != 0) {
            System.out.print("Informe: ");
            input = sc.nextInt();

            if (input == 0) {
                break;
            }

            array.add(input);
        }

        System.out.println("Menor elemento: " + Collections.min(array));
        System.out.println("Maior elemento: " + Collections.max(array));
        System.out.println("Média: " + calcularMedia(array));
    }

    public static double calcularMedia(ArrayList<Integer>  array){
        double soma = 0;
        for (Integer integer : array) {
            soma += integer;
        }

        return soma / array.size();
    }
}

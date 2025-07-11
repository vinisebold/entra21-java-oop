package exer_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia a classe ArrayList
        List<Integer> listaNumero =  new ArrayList<Integer>();
        listaNumero.add(2);
        listaNumero.add(6);
        listaNumero.add(12);
        listaNumero.add(9);
        listaNumero.add(18);
        listaNumero.add(20);

        int input = sc.nextInt();

        int indice = listaNumero.indexOf(input);

        if (indice != -1){
            System.out.println("Valor encontrado no índice " + indice);
        } else {
            System.out.println("Elemento não está na lista");
        }
    }
}

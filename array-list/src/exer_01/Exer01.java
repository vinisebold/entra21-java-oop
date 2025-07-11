package exer_01;

import java.util.ArrayList;
import java.util.List;

public class Exer01 {
    public static void main(String[] args) {

        // Cria um objeto ArrayList
        List<Integer> listaNumeros = new ArrayList<>();

        // Adiciona 5 elementos no ArrayList
        listaNumeros.add(9);
        listaNumeros.add(32);
        listaNumeros.add(91);
        listaNumeros.add(12);
        listaNumeros.add(55);

        // Ordena o ArrayList
        listaNumeros.sort(null);

        // Output
        System.out.println(listaNumeros);

    }

}

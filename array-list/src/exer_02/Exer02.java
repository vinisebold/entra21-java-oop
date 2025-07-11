package exer_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exer02 {
    public static void main(String[] args) {

        List<Double> listaNumeros = new ArrayList<Double>();

        // Adiciona 5 elementos nela
        listaNumeros.add(10.5);
        listaNumeros.add(11.6);
        listaNumeros.add(9.4);
        listaNumeros.add(8.3);
        listaNumeros.add(5.0);

        // Inverter ArrayList
        listaNumeros.sort(Collections.reverseOrder());

        System.out.println(listaNumeros);
    }
}

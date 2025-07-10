package exer_02;

import java.util.ArrayList;
import java.util.Collections;

public class Exer02 {
    public static void main(String[] args) {

        // Instancia a classe ArrayList
        ArrayList<Double> array = new ArrayList<Double>();

        // Adiciona 5 elementos nela
        array.add(10.5);
        array.add(11.6);
        array.add(9.4);
        array.add(8.3);
        array.add(5.0);

        // Inverter ArrayList
        Collections.reverse(array);

        for (Double aDouble : array) {
            System.out.println(aDouble);
        }
    }
}

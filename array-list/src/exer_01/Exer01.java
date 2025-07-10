package exer_01;

import java.util.ArrayList;
import java.util.Collections;

public class Exer01 {
    public static void main(String[] args) {

        // Cria um objeto ArrayList
        ArrayList<Integer> array = new ArrayList<Integer>();

        // Adiciona 5 elementos no ArrayList
        array.add(9);
        array.add(55);
        array.add(32);
        array.add(91);
        array.add(12);

        // Ordena o ArrayList
        Collections.sort(array);

        // Output
        for (Integer integer : array) {
            System.out.println(integer);
        }

    }

}

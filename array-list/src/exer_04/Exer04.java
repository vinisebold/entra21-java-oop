package exer_04;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia a classe ArrayList
        ArrayList<Integer> array =  new ArrayList<Integer>();
        array.add(2);
        array.add(6);
        array.add(12);
        array.add(9);
        array.add(18);
        array.add(20);

        int input = sc.nextInt();

        for(int i = 0; i < array.size(); i++){
            if (input == array.get(i)){
                System.out.println("Número encontrado: [" + array.get(i) + "] no índice " + i + ".");
                break;
            }
        }
    }
}

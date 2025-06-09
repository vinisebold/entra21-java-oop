package exercicios;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner input = new Scanner(System.in);

        // Input e Output
        System.out.print("Informe um número: ");
        imprimirSucessor(input.nextInt());

        // Fecha Scanner
        input.close();
    }

    public static void imprimirSucessor(int numInformado) {

        // Imprime os 20 sucessores do número informado
        for (int i = 0; i < 20; i++) {
            System.out.println(numInformado + i);
        }
    }
}

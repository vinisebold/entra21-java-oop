package exercicios;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe um número: ");
        int numInformado = sc.nextInt();

        //
        System.out.println("[" + numInformado + "]: "+imprimeBoolean(numInformado));

        // Fecha Scanner
        sc.close();
    }
    public static boolean imprimeBoolean(double pNum){
        return pNum % 2 == 0;
    }
}

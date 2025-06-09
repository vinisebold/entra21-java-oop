package exercicios;

import java.util.Scanner;

public class ExemploMetodoComParametro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 4: ");
        imprimirEstacao(sc.nextInt());
        sc.close();
    }

    public static void imprimirEstacao(int numInformado) {
        switch (numInformado) {
            case 1:
                System.out.println("É verão!");
                break;
            case 2:
                System.out.println("É outono!");
                break;
            case 3:
                System.out.println("É inverno!");
                break;
            case 4:
                System.out.println("É primavera!");
                break;
            default:
                System.out.println("Algo deu errado, tente novamente!");
        }


    }
}

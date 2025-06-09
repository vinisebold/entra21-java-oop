package exercicios;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 4: ");
        int numInformado = sc.nextInt();

        switch (numInformado) {
            case 1:
                imprimirVerao();
                break;
            case 2:
                imprimirOutono();
                break;
            case 3:
                imprimirInverno();
                break;
            case 4:
                imprimirPrimavera();
                break;
            default:
                System.out.println("Algo deu errado, tente novamente!");
        }

        sc.close();
    }

    public static void imprimirVerao() {
        System.out.println("É verão.\nPortanto o tempo está quente!");
    }

    public static void imprimirOutono() {
        System.out.println("É outono.\nPortando as folas estão caindo!");
    }

    public static void imprimirInverno() {
        System.out.println("É inverno.\nPortanto o tempo está frio!");
    }

    public static void imprimirPrimavera() {
        System.out.println("É primavera.\nPortando as flores estão crescendo!");
    }


}


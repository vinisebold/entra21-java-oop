package exercicios;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe uma palavra: ");
        String palavraInformada = sc.next();

        // Chamada de função
        System.out.println("Resultado: " + verificarPalavraInformada(palavraInformada));

        sc.close();
    }

    public static char verificarPalavraInformada(String palavraInformada) {
        if (palavraInformada.length() % 2 == 0) {
            return palavraInformada.charAt(0);
        } else {
            return palavraInformada.charAt(1);
        }

    }
}

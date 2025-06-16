package exercicios;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe seu nome: ");
        String nomeUsuario = input.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String sobrenomeUsuario = input.nextLine();

        System.out.print("Informe a cidade que você nasceu: ");
        String cidadeUsuario = input.nextLine();

        System.out.print("Informe o sobrenome de solteira de sua mãe: ");
        String sobrenomeMae = input.nextLine();

        // Fecha Scanner
        input.close();

        // Processamento e Output
        System.out.println(generateStarWarsName(nomeUsuario, sobrenomeUsuario, cidadeUsuario, sobrenomeMae));
    }

    public static String generateStarWarsName(String nome, String sobrenome, String cidade, String sobrenomeMae) {
        System.out.println("\nSeu nome completo na série Star Wars:");

        return sobrenome.substring(0, 3) + nome.substring(0, 2) + sobrenomeMae.substring(0, 2) + cidade.substring(0, 3);
    }
}

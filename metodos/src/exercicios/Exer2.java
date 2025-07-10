package exercicios;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o nome de seu colega: ");
        String nomeColega = sc.nextLine();

        // Processamento e Saida de dados
        switch (nomeColega.toLowerCase()) {
            case "gomes":
                imprimirGomes();
                break;
            case "sidney":
                imprimirSidney();
                break;
            case "kaio":
                imprimirKaio();
                break;

        }
        sc.close();
    }

    public static void imprimirGomes() {
        System.out.println("O nome dele(a) é Gomes\nEle(a) tem 16 anos\nEle(a) é estudante do SENAI");
    }

    public static void imprimirSidney() {
        System.out.println("O nome dele(a) é Sidney\nEle(a) tem 18 anos\nEle(a) é estudante do SENAI");
    }

    public static void imprimirKaio() {
        System.out.println("O nome dele(a) é Kaio\nEle(a) tem 17 anos\nEle(a) é estudante do SENAI");
    }
}

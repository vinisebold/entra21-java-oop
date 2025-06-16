package exercicios;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner input = new Scanner(System.in);

        // Declaração do array
        int[] vetor = new int[5];

        // Entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número (" + (i + 1) + "/5):");
            vetor[i] = input.nextInt();
        }

        // Métodos
        imprimirMaiorElemento(vetor);
        imprimirMenorElemento(vetor);
        imprimirMediaValores(vetor);

        // Fecha Scanner
        input.close();
    }

    public static void imprimirMaiorElemento(int[] vetor) {

        // Procura maior número vetor
        int maior = Integer.MIN_VALUE;
        for (int i : vetor) {
            if (i > maior) {
                maior = i;
            }
        }

        // Output
        System.out.println("\nO maior elemento do vetor é: " + maior);
    }

    public static void imprimirMenorElemento(int[] vetor) {

        // Procura menor número vetor
        int menor = Integer.MAX_VALUE;
        for (int i : vetor) {
            if (i < menor) {
                menor = i;
            }
        }

        // Output
        System.out.println("O menor elemento do vetor é: " + menor);
    }

    public static void imprimirMediaValores(int[] vetor) {

        // Faz a média do vetor
        double soma = 0;
        for (int i : vetor) {
            soma += i;
        }

        double media = soma / vetor.length;

        // Output
        System.out.println("A média dos valores do vetor é: " + media);
    }
}


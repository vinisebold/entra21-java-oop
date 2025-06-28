package exer_6;

import java.util.Arrays;

public class Mercado {
    String[] nomeMercado;
    int[] macasVendidas;
    double[] macasPrecos;
    int[] laranjaVendidas;
    double[] laranjaPrecos;

    public double[] maiorReceitaMaca() {

        double[] receitaTotal = new double[nomeMercado.length];
        double maior = Double.MIN_VALUE;
        int indice = 0;

        for (int i = 0; i < nomeMercado.length; i++) {
            receitaTotal[i] = macasVendidas[i] * macasPrecos[i];
            if (receitaTotal[i] > maior) {
                maior = receitaTotal[i];
                indice = i;
            }
        }

        return new double[]{indice, maior};
    }

    public double[] maiorReceitaLaranja() {

        double[] receitaTotal = new double[nomeMercado.length];
        double maior = Double.MIN_VALUE;
        int indice = 0;

        for (int i = 0; i < nomeMercado.length; i++) {
            receitaTotal[i] = laranjaVendidas[i] * laranjaPrecos[i];
            if (receitaTotal[i] > maior) {
                maior = receitaTotal[i];
                indice = i;
            }
        }


        return new double[]{indice, maior};
    }

    public int maiorReceitaTotal() {

        double[] receitaTotal = new double[nomeMercado.length];
        double maior = Double.MIN_VALUE;
        int indice = 0;

        for (int i = 0; i < nomeMercado.length; i++) {
            receitaTotal[i] = (laranjaVendidas[i] * laranjaPrecos[i]) + (macasVendidas[i] * macasPrecos[i]);
            if (receitaTotal[i] > maior) {
                maior = receitaTotal[i];
                indice = i;
            }
        }

        return indice;
    }

    public int menorReceitaTotal() {

        double[] receitaTotal = new double[nomeMercado.length];
        double menor = Double.MAX_VALUE;
        int indice = 0;

        for (int i = 0; i < nomeMercado.length; i++) {
            receitaTotal[i] = (laranjaVendidas[i] * laranjaPrecos[i]) + (macasVendidas[i] * macasPrecos[i]);
            if (receitaTotal[i] < menor) {
                menor = receitaTotal[i];
                indice = i;
            }
        }

        return indice;
    }

    public int verificarLojaMeio() {

        double[] receitaTotal = new double[nomeMercado.length];

        for (int i = 0; i < nomeMercado.length; i++) {
            receitaTotal[i] = (laranjaVendidas[i] * laranjaPrecos[i]) + (macasVendidas[i] * macasPrecos[i]);
        }

        double[] receitaOrdenada = Arrays.copyOf(receitaTotal, receitaTotal.length);

        double aux = 0;
        for (int i = 0; i < nomeMercado.length; i++) {
            for (int j = 0; j < (nomeMercado.length - 1); j++) {
                if (receitaOrdenada[j] > receitaOrdenada[j + 1]) {
                    aux = receitaOrdenada[j];
                    receitaOrdenada[j] = receitaOrdenada[j + 1];
                    receitaOrdenada[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < nomeMercado.length; i++) {
            if (receitaOrdenada[1] == receitaTotal[i]) {
                return i;
            }
        }

        return 0;
    }

    public String verificarProdutoMaisVendido() {

        double totalMacas = 0;
        double totalLaranjas = 0;

        for (int i = 0; i < nomeMercado.length; i++) {
            totalMacas += (macasVendidas[i] * macasPrecos[i]);
            totalLaranjas += (laranjaVendidas[i] * laranjaPrecos[i]);
        }

        if (totalMacas > totalLaranjas) {
            return "Maças";
        } else {
            return "Laranjas";
        }
    }

}

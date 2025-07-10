package exer_06;

public class Mercado {

    String nome;
    int qtdMacasVendidas;
    double precoMacas;
    int qtdLaranjasVendidas;
    double precoLaranjas;

    public double calcularReceitaMacas() {
        return qtdMacasVendidas * precoMacas;
    }

    public double calcularReceitaLaranjas() {
        return qtdLaranjasVendidas * precoLaranjas;
    }

    public double calcularReceitaTotal() {
        return calcularReceitaMacas() + calcularReceitaLaranjas();
    }
}


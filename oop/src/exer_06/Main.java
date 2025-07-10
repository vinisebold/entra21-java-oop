package exer_06;

public class Main {
    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nome = "Giassi";
        unidadeDeBlumenau.qtdMacasVendidas = 2000;
        unidadeDeBlumenau.precoMacas = 1.5;
        unidadeDeBlumenau.qtdLaranjasVendidas = 150;
        unidadeDeBlumenau.precoLaranjas = 2;

        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nome = "Angeloni";
        unidadeDeJoinville.qtdMacasVendidas = 250;
        unidadeDeJoinville.precoMacas = 1.7;
        unidadeDeJoinville.qtdLaranjasVendidas = 12;
        unidadeDeJoinville.precoLaranjas = 1.8;

        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nome = "Bistek";
        unidadeDeFlorianopolis.qtdMacasVendidas = 300000;
        unidadeDeFlorianopolis.precoMacas = 1.4;
        unidadeDeFlorianopolis.qtdLaranjasVendidas = 1780000;
        unidadeDeFlorianopolis.precoLaranjas = 1.51;

        Mercado[] vetor = {unidadeDeBlumenau, unidadeDeFlorianopolis, unidadeDeJoinville};

        // Quem teve a maior receita vendendo macas
        double maiorReceitaMacas = Double.MIN_VALUE;
        Mercado mercadoMaiorReceitaMacas = null;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].calcularReceitaMacas() > maiorReceitaMacas) {
                maiorReceitaMacas = vetor[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = vetor[i];
            }
        }

        System.out.println("O mercado que mais teve receita com a venda de maçãs foi: " + mercadoMaiorReceitaMacas.nome);

        // Quem teve a maior receita vendendo laranjas
        double maiorReceitaLaranjas = Double.MIN_VALUE;
        Mercado mercadoMaiorReceitaLaranjas = null;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].calcularReceitaLaranjas() > maiorReceitaLaranjas) {
                maiorReceitaLaranjas = vetor[i].calcularReceitaLaranjas();
                mercadoMaiorReceitaLaranjas = vetor[i];
            }
        }

        System.out.println("Receita laranjas: " + mercadoMaiorReceitaLaranjas.nome);

        // Quem teve a maior receita
        double maiorReceitaTotal = Double.MIN_VALUE;
        Mercado mercadoMaiorReceitaTotal = null;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].calcularReceitaTotal() > maiorReceitaTotal) {
                maiorReceitaTotal = vetor[i].calcularReceitaTotal();
                mercadoMaiorReceitaTotal = vetor[i];
            }
        }

        System.out.println("Maior receita total: " + mercadoMaiorReceitaTotal.nome);

        // Qual das lojas teve a segunda maior receita total
        double maiorValorTotal = Double.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].calcularReceitaTotal() > maiorValorTotal) {
                maiorValorTotal = vetor[i].calcularReceitaTotal();
            }
        }

        double segundoMaiorValor = Double.MIN_VALUE;
        Mercado mercadoSegundoMaior = null;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].calcularReceitaTotal() > segundoMaiorValor && vetor[i].calcularReceitaTotal() != maiorValorTotal) {
                segundoMaiorValor = vetor[i].calcularReceitaTotal();
                mercadoSegundoMaior = vetor[i];
            }
        }

        System.out.println("Segundo maior: " + mercadoSegundoMaior.nome);

    }
}


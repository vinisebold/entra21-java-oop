package exer_6;

public class Main {
    public static void main(String[] args) {
        // Cria objeto
        Mercado mercados = new Mercado();
        mercados.nomeMercado = new String[]{"Fort Atacadista", "Sam's Club", "Supermercado do Zé"};
        mercados.macasVendidas = new int[]{400, 250, 180};
        mercados.macasPrecos = new double[]{2, 1.8, 2};
        mercados.laranjaVendidas = new int[]{300, 215, 405};
        mercados.laranjaPrecos = new double[]{2, 2, 2};

        // Output
        double[] maiorReceita = mercados.maiorReceitaMaca();
        int idxNome = (int) maiorReceita[0];
        System.out.println("Quem teve maior receita vendendo maçãs? " + mercados.nomeMercado[idxNome] + " - " + maiorReceita[1]);

        maiorReceita = mercados.maiorReceitaLaranja();
        idxNome = (int) maiorReceita[0];

        System.out.println("Quem teve maior receita vendendo laranjas? " + mercados.nomeMercado[idxNome] + " - " + maiorReceita[1]);

        System.out.println("Qual loja teve a maior receita? " + mercados.nomeMercado[mercados.maiorReceitaTotal()]);

        System.out.println("Qual loja teve a menor receita? " + mercados.nomeMercado[mercados.menorReceitaTotal()]);

        System.out.println("Qual loja ficou no \"meio\" em termos de receita? " + mercados.nomeMercado[mercados.verificarLojaMeio()]);

        System.out.println("Juntando as 3 lojas a franquia teve uma receita maior vendendo oque? " + mercados.verificarProdutoMaisVendido());



    }
}

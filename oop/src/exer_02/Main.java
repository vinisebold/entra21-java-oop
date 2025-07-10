package exer_02;

public class Main {
    public static void main(String[] args) {

        // Cria objeto
        Mercado unidadeDeBlumenau = new Mercado();
        unidadeDeBlumenau.nomeMercado = "Fort Atacadista";
        unidadeDeBlumenau.macasVendidas = 205;
        unidadeDeBlumenau.macasPrecos = 1.3;
        unidadeDeBlumenau.laranjaVendidas = 230;
        unidadeDeBlumenau.laranjaPrecos = 2.9;

        // Cria objeto
        Mercado unidadeDeJoinville = new Mercado();
        unidadeDeJoinville.nomeMercado = "Sam's Club";
        unidadeDeJoinville.macasVendidas = 80;
        unidadeDeJoinville.macasPrecos = 3.8;
        unidadeDeJoinville.laranjaVendidas = 92;
        unidadeDeJoinville.laranjaPrecos = 4.2;

        // Cria objeto
        Mercado unidadeDeFlorianopolis = new Mercado();
        unidadeDeFlorianopolis.nomeMercado = "Supermercado do Zé";
        unidadeDeFlorianopolis.macasVendidas = 300;
        unidadeDeFlorianopolis.macasPrecos = 1.1;
        unidadeDeFlorianopolis.laranjaVendidas = 292;
        unidadeDeFlorianopolis.laranjaPrecos = 1.2;
    }
}

package exer_6;

public class Main {
    public static void main(String[] args) {
        // Cria objeto
        Mercado mercados = new Mercado();
        mercados.nomeMercado = new String[]{"Fort Atacadista", "Sam's Club", "Supermercado do Zé"};
        mercados.macasVendidas = new int[]{400, 250, 180};
        mercados.macasPrecos = new double[]{2, 1.8, 2};
        mercados.laranjaVendidas = new int[]{400, 215, 400};
        mercados.laranjaPrecos = new double[]{2, 2, 2};

        mercados.verificarLojaMeio();

    }
}

package ro_02;

public class App {
    public static void main(String[] args) {
        Flor f1 = new Flor("Rosa", 19, "Pedro", false);
        Flor f2 = new Flor("Margarida", 91, "Maria", false);
        Flor f3 = new Flor("Lírio", 40, "Vinicius", true);
        Flor f4 = new Flor("Alecrim", 45, "Gabi", true);

        Floricultura listaFlores = new Floricultura();

        listaFlores.adicionarFlores(f1);
        listaFlores.adicionarFlores(f2);
        listaFlores.adicionarFlores(f3);
        listaFlores.adicionarFlores(f4);

        listaFlores.obterFlorMaisCara();
        System.out.println("Flor mais cara: "+listaFlores.obterFlorMaisCara());
        System.out.println(listaFlores.isReceitaMaiorComPresente() ? "Maior receita com presente" : "Maior receita não foi para presente");


    }
}

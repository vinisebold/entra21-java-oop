package ro_06;

public class App {
    public static void main(String[] args) {
        Vereador v1 = new Vereador("Carlos Andrade", "MDB", 1, 0);
        Vereador v2 = new Vereador("João Costa", "PSDB", 30, 6);
        Vereador v3 = new Vereador("Ana Beatriz Rocha", "PDT", 18, 5);
        Vereador v4 = new Vereador("Ricardo Nunes", "PL", 20, 4);


        CamaraDeVereadores camaraDeVereadores = new CamaraDeVereadores();

        camaraDeVereadores.addVereador(v1);
        camaraDeVereadores.addVereador(v2);
        camaraDeVereadores.addVereador(v3);
        camaraDeVereadores.addVereador(v4);


        System.out.println("Total de projetos apresentados: " + camaraDeVereadores.obterTotalProjetosApresentados());
        System.out.println("Total de projetos aprovados: " + camaraDeVereadores.obterTotalProjetosAprovados());
        System.out.println("Vereador com mais projetos aprovados: " + camaraDeVereadores.obterVereadorMaisProjetosAprovados());
        System.out.println("Vereador com maior desempenho: " + camaraDeVereadores.obterVereadorMaiorDesempenho());
        System.out.println("Vereadores acima da média: " + camaraDeVereadores.obterVereadoresAcimaDaMedia());
    }
}

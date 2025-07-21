package ro_06;

public class App {
    public static void main(String[] args) {
        Vereador v1 = new Vereador("Carlos Andrade", "MDB", 42, 27);
        Vereador v2 = new Vereador("João Costa", "PSDB", 28, 15);
        Vereador v3 = new Vereador("Ana Beatriz Rocha", "PDT", 51, 33);
        Vereador v4 = new Vereador("Ricardo Nunes", "PL", 39, 21);


        CamaraDeVereadores camaraDeVereadores = new CamaraDeVereadores();

        camaraDeVereadores.addVereador(v1);
        camaraDeVereadores.addVereador(v2);
        camaraDeVereadores.addVereador(v3);
        camaraDeVereadores.addVereador(v4);
    }
}

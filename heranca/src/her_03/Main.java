package her_03;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Canis lupus familiaris", true, 12.5, "Labrador Retriever");
        Gato g1 = new Gato("Felis catus", true, 4.2, true);

        c1.som();
        g1.som();
    }
}

package ro_01;

public class App {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(10, 20);
        Retangulo r2 = new Retangulo(5, 10);
        Retangulo r3 = new Retangulo(20, 25);
        Retangulo r4 = new Retangulo(30, 50);

        ListaRetangulo lista = new ListaRetangulo();

        lista.adicionarRetangulo(r1);
        lista.adicionarRetangulo(r2);
        lista.adicionarRetangulo(r3);
        lista.adicionarRetangulo(r4);

        System.out.println(lista);

    }
}

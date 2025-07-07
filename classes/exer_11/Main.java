package exer_11;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("System Design", false);
        Livro livro2 = new Livro("Previsivelmente Irracional", true);

        System.out.println(livro1 + "\n" + livro2);

        livro1.emprestar();
        livro2.devolver();

        System.out.println(livro1 + "\n" + livro2);

    }
}

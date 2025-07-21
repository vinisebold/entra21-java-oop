package ro_05;

public class App {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("R. Jose", "Apt 92", 33);
        Pessoa pessoa1 = new Pessoa("Vinicius", endereco1);

        System.out.println(pessoa1);

        Endereco endereco2 = new Endereco("R. Maria Flores", "Casa", 41);
        Pessoa pessoa2 = new Pessoa("Gabriela", endereco2);

        System.out.println(pessoa2);


    }
}

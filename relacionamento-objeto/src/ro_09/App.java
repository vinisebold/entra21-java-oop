package ro_09;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", LocalDate.of(2000, 1, 27));
        Pessoa p2 = new Pessoa("Vinicius", LocalDate.of(2008, 7, 3));
        Pessoa p3 = new Pessoa("Edison", LocalDate.of(1961, 3, 6));

        Familia f1 = new Familia();

        f1.adicionarPessoas(p1);
        f1.adicionarPessoas(p2);
        f1.adicionarPessoas(p3);

        System.out.println(f1.pessoaMaisVelha());

    }
}

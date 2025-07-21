package ro_09;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", LocalDate.of(2000, Month.JANUARY, 27));
        Pessoa p2 = new Pessoa("Vinicius", LocalDate.of(2008, Month.JULY, 3));
        Pessoa p3 = new Pessoa("Edison", LocalDate.of(1961, Month.MAY, 6));

    }
}

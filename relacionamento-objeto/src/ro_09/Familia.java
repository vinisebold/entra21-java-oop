package ro_09;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Familia {
    List<Pessoa> listaPessoas;

    public Familia() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoas(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public Pessoa pessoaMaisVelha() {
        Pessoa pessoaMaisVelha = null;
        LocalDate dataAntiga = LocalDate.now();

        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getDataNascimento().isBefore(dataAntiga)) {
                dataAntiga = pessoa.getDataNascimento();
                pessoaMaisVelha = pessoa;
            }
        }

        return pessoaMaisVelha;
    }
}

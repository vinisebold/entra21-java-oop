package ro_09;

import java.util.ArrayList;
import java.util.List;

public class Familia {
    List<Pessoa> listaPessoas;

    public Familia(){
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoas(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }

    public Pessoa pessoaMaisVelha(){
        int idade = 0;
        Pessoa pessoaMaisVelha = null;

        for (Pessoa pessoa : listaPessoas){
            if (pessoa.getDataNascimento())
        }
    }
}

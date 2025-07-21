package ro_02;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    private List<Flor> listaFlores;

    public Floricultura() {
        listaFlores = new ArrayList<>();
    }

    public void adicionarFlores(Flor f) {
        listaFlores.add(f);
    }

    public Flor obterFlorMaisCara() {
        double maisCaro = Double.NEGATIVE_INFINITY;
        Flor florMaisCara = null;

        for (Flor f : listaFlores) {
            if (f.getPreco() > maisCaro) {
                maisCaro = f.getPreco();
                florMaisCara = f;
            }
        }


        return florMaisCara;
    }

    public boolean isReceitaMaiorComPresente() {
        double receitaPresente = 0;
        double receitaNaoPresente = 0;

        for (Flor f : listaFlores) {
            if (f.isPresente()) {
                receitaPresente += f.getPreco();
            } else {
            receitaNaoPresente += f.getPreco();
            }
        }

        return receitaPresente > receitaNaoPresente;
    }
}

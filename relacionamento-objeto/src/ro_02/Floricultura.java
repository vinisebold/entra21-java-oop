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

    public Flor florMaisCara() {
        double maisCaro = Double.MIN_EXPONENT;
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

        double somaPresente = 0;
        double somaNaoPresente = 0;

        for (Flor f : listaFlores) {
            if (f.isPresente()) {
                somaPresente += f.getPreco();
            } else {
            somaNaoPresente += f.getPreco();
            }
        }

        return somaPresente > somaNaoPresente;
    }
}

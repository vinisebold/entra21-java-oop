package ro_02;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    List<Flor> listaFlores;

    public Floricultura(){
        listaFlores = new ArrayList<>();
    }

    public void adicionarFlores(Flor f){
        listaFlores.add(f);
    }
    
    public double florMaisCara(Flor f){
        return 0;
    }
}

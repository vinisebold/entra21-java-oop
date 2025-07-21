package ro_06;

import java.util.ArrayList;
import java.util.List;

public class CamaraDeVereadores {
    private List<Vereador> camaraDeVereadores;

    public CamaraDeVereadores() {
        camaraDeVereadores = new ArrayList<>();
    }

    public void addVereador(Vereador vereador){
        camaraDeVereadores.add(vereador);
    }


}

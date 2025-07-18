package ro_03;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Material> listaMateriais;

    public Loja() {
        listaMateriais = new ArrayList<>();
    }

    public void adicionarMaterial(Material m) {
        listaMateriais.add(m);
    }

    public Material obterMaterialMaisCaro() {

        double maiorPreco = Double.MIN_VALUE;
        Material materialMaisCaro = null;

        for (Material m : listaMateriais) {
            if (m.getPreco() > maiorPreco) {
                maiorPreco = m.getPreco();
                materialMaisCaro = m;
            }
        }

        return materialMaisCaro;
    }

    public Material obterMaterialMaisVolumoso() {
        double maiorVolume = Double.MIN_VALUE;
        Material materialMaisVolumoso = null;

        for (Material m : listaMateriais) {
            if (m.getVolume() > maiorVolume) {
                maiorVolume = m.getVolume();
                materialMaisVolumoso = m;
            }
        }

        return materialMaisVolumoso;
    }

}

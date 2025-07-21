package ro_06;

import java.util.ArrayList;
import java.util.List;

public class CamaraDeVereadores {
    private List<Vereador> camaraDeVereadores;

    public CamaraDeVereadores() {
        camaraDeVereadores = new ArrayList<>();
    }

    public void addVereador(Vereador vereador) {
        camaraDeVereadores.add(vereador);
    }

    public int obterTotalProjetosApresentados() {
        int totalProjetos = 0;
        for (Vereador vereador : camaraDeVereadores) {
            totalProjetos += vereador.getQntdProjetosApresentados();
        }

        return totalProjetos;
    }

    public int obterTotalProjetosAprovados(){
        int totalProjetos = 0;
        for (Vereador vereador : camaraDeVereadores){
            totalProjetos += vereador.getQntdProjetosAprovados();
        }
        return totalProjetos;
    }

    public Vereador obterVereadorMaisProjetosAprovados() {
        int maiorQntdProjetoAprovado = Integer.MIN_VALUE;
        Vereador vereadorMaisProjetosAprovados = null;

        for (Vereador vereador : camaraDeVereadores) {
            if (vereador.getQntdProjetosAprovados() > maiorQntdProjetoAprovado) {
                maiorQntdProjetoAprovado = vereador.getQntdProjetosAprovados();
                vereadorMaisProjetosAprovados = vereador;
            }
        }

        return vereadorMaisProjetosAprovados;
    }

    public Vereador obterVereadorMaiorDesempenho() {
        double maiorDesempenho = Double.NEGATIVE_INFINITY;
        Vereador vereadorMaiorDesempenho = null;

        for (Vereador vereador : camaraDeVereadores) {
            if (vereador.obterDesempenho() > maiorDesempenho) {
                maiorDesempenho = vereador.obterDesempenho();
                vereadorMaiorDesempenho = vereador;
            }
        }

        return vereadorMaiorDesempenho;
    }

    private double obterMediaDesempenho() {
        double somaDesempenho = 0;
        int qntdVereador = 0;

        for (Vereador vereador : camaraDeVereadores) {
            somaDesempenho += vereador.obterDesempenho();
            qntdVereador++;
        }

        return somaDesempenho / qntdVereador;
    }

    public List<Vereador> obterVereadoresAcimaDaMedia() {

        List<Vereador> vereadoresAcimaMedia = new ArrayList<>();

        double media = obterMediaDesempenho();
        for (Vereador vereador : camaraDeVereadores) {
            if (vereador.obterDesempenho() > media) {
                vereadoresAcimaMedia.add(vereador);
            }
        }
        return vereadoresAcimaMedia;
    }
}

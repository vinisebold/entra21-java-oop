package ro_08;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private List<Computador> laboratorioDeInformatica;

    public Laboratorio() {
        laboratorioDeInformatica = new ArrayList<>();
    }

    public void addComputador(Computador computador) {
        laboratorioDeInformatica.add(computador);
    }

    public int obterArmazenamentoTotal() {

        int somaArmazenamento = 0;
        for (Computador computador : laboratorioDeInformatica) {
            somaArmazenamento += computador.getQntdArmazenamento();
        }


        return somaArmazenamento;
    }

    public int obterConsumoTotal() {

        int somaConsumo = 0;
        for (Computador computador : laboratorioDeInformatica) {
            somaConsumo += computador.getConsumoFonte();
        }

        return somaConsumo;
    }

    public double calcularPotenciaMinima() {
        return (obterConsumoTotal() * 1.1);
    }

    public double calcularGastoEletrico(int qntdDeSalas) {
        double consumoTotal = calcularPotenciaMinima() * qntdDeSalas;
        double consumokWh = (consumoTotal * 12) / 1000;


        return 0.71 * consumokWh;
    }
}

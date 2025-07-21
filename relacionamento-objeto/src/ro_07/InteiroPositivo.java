package ro_07;

import java.util.ArrayList;
import java.util.List;

public class InteiroPositivo {
    private int numero;

    public InteiroPositivo(int numero) {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Valor inválido");
        this.numero = numero;
    }

    public int obterNumeroMultiplicado(InteiroPositivo valor) {
        return numero * valor.getNumero();
    }

    public int calcularFatorial() {
        int valorFatorial = numero;
        int i = numero;

        while (i > 1) {
            i--;
            valorFatorial = valorFatorial * i;
        }

        return valorFatorial;
    }

    public int obterQuantidadeDivisoresInteiros() {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador;
    }

    public List<Integer> obterDivisoresInteiros() {
        List<Integer> listaDivisoresInteiros = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                listaDivisoresInteiros.add(i);
            }
        }

        return listaDivisoresInteiros;
    }

    public List<Integer> calcularSerieFibonacci() {
        int primeiro = 0, segundo = 1;
        List<Integer> sequenciaFibonacci = new ArrayList<>();

        sequenciaFibonacci.add(primeiro);
        sequenciaFibonacci.add(segundo);

        for (int i = 2; i < numero; i++) {
            int proximo = primeiro + segundo;
            sequenciaFibonacci.add(proximo);
            primeiro = segundo;
            segundo = proximo;
        }
        return sequenciaFibonacci;
    }
}

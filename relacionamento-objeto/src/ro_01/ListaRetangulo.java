package ro_01;

import java.util.ArrayList;
import java.util.List;

public class ListaRetangulo {
    private List<Retangulo> listaRetangulo;

    // Construtor
    public ListaRetangulo() {
        listaRetangulo = new ArrayList<>();
    }

    public void adicionarRetangulo(Retangulo r) {
        listaRetangulo.add(r);
    }

    // Métodos
    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public Retangulo encontrarRetanguloMaiorArea() {

        double maiorArea = Double.MIN_VALUE;
        Retangulo retanguloMaiorArea = null;

        for (Retangulo a : listaRetangulo) {
            if (calcularArea(a.getLargura(), a.getAltura()) > maiorArea) {
                maiorArea = calcularArea(a.getLargura(), a.getAltura());
                retanguloMaiorArea = a;
            }
        }

        return retanguloMaiorArea;
    }

    public Retangulo encontrarRetanguloMaiorPerimetro() {

        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo retanguloMaiorPerimetro = null;

        for (Retangulo a : listaRetangulo) {
            if (calcularPerimetro(a.getLargura(), a.getLargura()) > maiorPerimetro) {
                maiorPerimetro = calcularPerimetro(a.getLargura(), a.getAltura());
                retanguloMaiorPerimetro = a;
            }
        }

        return retanguloMaiorPerimetro;
    }

    @Override
    public String toString() {
        return "Retângulo com maior área: " + encontrarRetanguloMaiorArea() + "\nRetângulo com maior perímetro: " + encontrarRetanguloMaiorPerimetro();
    }
}

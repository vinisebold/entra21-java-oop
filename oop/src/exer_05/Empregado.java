package exer_05;

public class Empregado {

    String indentificacao;
    String nome;
    String sobreNome;
    double salario;

    public double mostrarSalarioAnual() {
        return salario * 12;
    }

    public String mostrarNomeCompleto() {
        return nome + " " + sobreNome;
    }

    public void setSalario(double pPercentual) {
        salario = salario + (salario * (pPercentual / 100));
    }
}

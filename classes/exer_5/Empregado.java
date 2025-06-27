package exer_5;

public class Empregado {

    int indentificacao;
    String nome;
    String sobreNome;
    double salario;

    public double verificarSalarioAnual(){
        return salario * 12;
    }

    public String verificarNomeCompleto(){
        return nome + sobreNome;
    }

    public void setSalario(double pPercentual){
        salario = salario * pPercentual;
    }

}

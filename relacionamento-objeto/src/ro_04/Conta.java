package ro_04;

public class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular.isBlank()) throw new IllegalArgumentException("Nome invalido");
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) throw new IllegalArgumentException("Valor invalido");
        this.saldo = saldo;
    }

    public void sacarDinheiro(double valor){
        if (valor > saldo || valor <= 0) throw new IllegalArgumentException("Valor invalido");
        saldo -= valor;
    }

    public void depositarDinheiro(double valor){
        if (valor <= 0) throw new IllegalArgumentException("Valor Invalido");
        saldo += valor;
    }

    public void transferirDinheiro(Conta pConta, double valor){
        if (valor > saldo || valor <= 0) throw new IllegalArgumentException("Valor invalido");
        saldo -= valor;
        pConta.saldo += valor;
    }

    @Override
    public String toString() {
        return "nomeTitular: " + nomeTitular + ", saldo: " + saldo;
    }
}

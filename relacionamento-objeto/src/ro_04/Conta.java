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
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacarDinheiro(double valor){
        saldo -= valor;
    }

    public void depositarDinheiro(double valor){
        saldo += valor;
    }

    public void transferirDinheiro(Conta pConta, double valor){
        pConta.saldo += valor;
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "nomeTitular: " + nomeTitular + ", saldo: " + saldo;
    }
}

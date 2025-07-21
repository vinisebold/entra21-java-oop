package ro_02;

public class Flor {
    private String nome;
    private double preco;
    private String nomeCliente;
    private boolean presente;

    public Flor(String nome, double preco, String nomeCliente, boolean presente) {
        setNome(nome);
        setPreco(preco);
        setNomeCliente(nomeCliente);
        setPresente(presente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome da flor inválida");
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) throw new IllegalArgumentException("Preço inválido");
        this.preco = preco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()) throw new IllegalArgumentException("Nome do cliente inválido");
        this.nomeCliente = nomeCliente;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", preco=" + preco + ", nomeCliente=" + nomeCliente + (presente ? ", a flor foi para presente" : ", a flor nao foi para presente");
    }
}

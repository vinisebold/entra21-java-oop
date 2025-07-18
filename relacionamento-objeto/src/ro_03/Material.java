package ro_03;

public class Material {
    private String nome;
    private String descricao;
    private double preco;
    private double volume;
    private double peso;
    private int qntdEstoque;

    public Material(String nome, String descricao, double preco, double volume, double peso, int qntdEstoque) {
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
        setVolume(volume);
        setPeso(peso);
        setQntdEstoque(qntdEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQntdEstoque() {
        return qntdEstoque;
    }

    public void setQntdEstoque(int qntdEstoque) {
        this.qntdEstoque = qntdEstoque;
    }


    // Adicionar Estoque
    public void adicionarEstoque(int valor) {
        qntdEstoque += valor;
    }

    // Vender Produto
    public void venderPruduto(int valor) {
        if (valor > qntdEstoque) throw new IllegalArgumentException("Valor acima do permitido");
        qntdEstoque -= valor;
    }

    // Promoção Produto
    public void promocaoProduto(int valor) {
        valor = valor / 100;
        preco = preco * valor;
    }
}

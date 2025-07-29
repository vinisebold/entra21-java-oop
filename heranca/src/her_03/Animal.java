package her_03;

abstract class Animal {

    private String especie;
    private boolean estimacao;
    private double peso;

    public Animal(String especie, boolean estimacao, double peso) {
        setEspecie(especie);
        setEstimacao(estimacao);
        setPeso(peso);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isEstimacao() {
        return estimacao;
    }

    public void setEstimacao(boolean estimacao) {
        this.estimacao = estimacao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void som();
}

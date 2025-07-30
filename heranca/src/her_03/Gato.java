package her_03;

public class Gato extends  Animal{

    private boolean cadastro;

    public Gato(String especie, boolean estimacao, double peso, boolean cadastro) {
        super(especie, estimacao, peso);
        setCadastro(cadastro);
    }

    public boolean isCadastro() {
        return cadastro;
    }

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}

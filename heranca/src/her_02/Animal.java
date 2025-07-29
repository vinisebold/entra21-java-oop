package her_02;

public class Animal {
    private String raca;
    private String nomeIdentificacao;
    private String porte;
    private String habitat;
    private String paisOrigem;

    public Animal(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem) {
        setRaca(raca);
        setNomeIdentificacao(nomeIdentificacao);
        setPorte(porte);
        setHabitat(habitat);
        setPaisOrigem(paisOrigem);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeIdentificacao() {
        return nomeIdentificacao;
    }

    public void setNomeIdentificacao(String nomeIdentificacao) {
        this.nomeIdentificacao = nomeIdentificacao;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}

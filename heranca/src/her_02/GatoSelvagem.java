package her_02;

public class GatoSelvagem extends Animal {

    private String corPelagem;
    private String tiposManchas;

    public GatoSelvagem(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPelagem, String tiposManchas) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPelagem(corPelagem);
        setTiposManchas(tiposManchas);
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }

    public String getTiposManchas() {
        return tiposManchas;
    }

    public void setTiposManchas(String tiposManchas) {
        this.tiposManchas = tiposManchas;
    }
}

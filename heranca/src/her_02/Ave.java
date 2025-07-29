package her_02;

public class Ave extends Animal{
    private String corPenas;
    private String tipoAlimentacao;

    public Ave(String raca, String nomeIdentificacao, String porte, String habitat, String paisOrigem, String corPenas, String tipoAlimentacao) {
        super(raca, nomeIdentificacao, porte, habitat, paisOrigem);
        setCorPenas(corPenas);
        setTipoAlimentacao(tipoAlimentacao);
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }
}

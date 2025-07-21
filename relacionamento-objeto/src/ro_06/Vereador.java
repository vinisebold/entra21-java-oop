package ro_06;

public class Vereador {
    private String nome;
    private String partido;
    private int qntdProjetosApresentados;
    private int qntdProjetosAprovados;

    public Vereador(String nome, String partido, int qntdProjetosApresentados, int qntdProjetosAprovados) {
        setNome(nome);
        setPartido(partido);
        setQntdProjetosApresentados(qntdProjetosApresentados);
        setQntdProjetosAprovados(qntdProjetosAprovados);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) throw new IllegalArgumentException("Nome invalido");
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        if (partido.isBlank()) throw new IllegalArgumentException("Partido Invalido");
        this.partido = partido;
    }

    public int getQntdProjetosApresentados() {
        return qntdProjetosApresentados;
    }

    public void setQntdProjetosApresentados(int qntdProjetosApresentados) {
        if (qntdProjetosApresentados < 0) throw new IllegalArgumentException("Numero invalido");
        this.qntdProjetosApresentados = qntdProjetosApresentados;
    }

    public int getQntdProjetosAprovados() {
        return qntdProjetosAprovados;
    }

    public void setQntdProjetosAprovados(int qntdProjetosAprovados) {
        if (qntdProjetosAprovados < 0 || qntdProjetosAprovados > qntdProjetosApresentados) throw new IllegalArgumentException("Numero invalido");
        this.qntdProjetosAprovados = qntdProjetosAprovados;
    }

    private double obterIndiceTrabalho() {

        if (qntdProjetosApresentados == 0) {
            return 0;
        } else if (qntdProjetosApresentados <= 5) {
            return 0.80;
        } else if (qntdProjetosApresentados <= 10) {
            return 1.00;
        } else if (qntdProjetosApresentados <= 17) {
            return 1.08;
        }
        return 1.22;
    }

    public double obterDesempenho() {
        return ((double) qntdProjetosAprovados / qntdProjetosApresentados) * obterIndiceTrabalho();
    }

    @Override
    public String toString() {
        return nome + ", " + partido + ", " + qntdProjetosApresentados + ", " + qntdProjetosAprovados;
    }
}

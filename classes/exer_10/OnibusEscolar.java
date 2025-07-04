package exer_10;

public class OnibusEscolar {

    // Variáveis
    private int qntdEstudantes;
    private int qntdProfessores;

    // Construtor
    public OnibusEscolar(int qntdEstudantes, int qntdProfessores) {
        setEstudantes(qntdEstudantes);
        setProfessores(qntdProfessores);
    }

    // Setter
    public void setEstudantes(int qntdEstudantes) {
        if (getAlunos() > 40) {
            qntdEstudantes = 40;
        }

        this.qntdEstudantes = qntdEstudantes;
    }

    public void setProfessores(int qntdProfessores) {
        this.qntdProfessores = qntdProfessores;

        if (getProfessores() == 0){
            setEstudantes(0);
        }

    }

    // Getter
    public int getAlunos() {
        return qntdEstudantes;
    }

    public int getProfessores() {
        return qntdProfessores;
    }

    public void removerAlunos(int removerAlunos){
        setEstudantes(getAlunos() - removerAlunos);
    }

    @Override
    public String toString() {
        return "OnibusEscolar{" +
                "qntdEstudantes=" + qntdEstudantes +
                ", qntdProfessores=" + qntdProfessores +
                '}';
    }
}

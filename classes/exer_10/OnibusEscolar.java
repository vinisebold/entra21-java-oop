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

    // Setters
    public void setEstudantes(int qntdEstudantes) {
        if (qntdEstudantes > 40) {
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

    // Getters
    public int getAlunos() {
        return qntdEstudantes;
    }

    public int getProfessores() {
        return qntdProfessores;
    }

    // Metodo removerAlunos
    public void removerAlunos(int removerAlunos){
        setEstudantes(getAlunos() - removerAlunos);
    }

    // Sobrescrever metodo toString
    @Override
    public String toString() {
        return "OnibusEscolar{" +
                "qntdEstudantes=" + qntdEstudantes +
                ", qntdProfessores=" + qntdProfessores +
                '}';
    }
}

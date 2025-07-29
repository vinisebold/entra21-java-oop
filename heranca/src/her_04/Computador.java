package her_04;

abstract class Computador {
    private String modelo;
    private double ram;
    private double armazenamento;

    public Computador(String modelo, double ram, double armazenamento) {
        setModelo(modelo);
        setRam(ram);
        setArmazenamento(armazenamento);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String ligarOuDesligar(boolean estado) {
        if (estado) {
            return "Ligando";
        }
        return "Desligando";
    }

    public abstract boolean rodarAplicacao(String valor);
}

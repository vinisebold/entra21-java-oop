package her_04;

public class Notebook extends Computador {
    private double peso;

    public Notebook(String modelo, double ram, double armazenamento, double peso) {
        super(modelo, ram, armazenamento);
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void aumentarRam(double valor){
        setRam(getRam() + valor);
    }

    public boolean rodarAplicacao(String valor) {
        return valor.contains(".exe");
    }
}

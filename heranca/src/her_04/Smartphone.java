package her_04;

public class Smartphone extends Computador {
    private int operadora;
    private boolean cameraFrontal;

    public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
        super(modelo, ram, armazenamento);
        setOperadora(operadora);
        setCameraFrontal(cameraFrontal);
    }

    public int getOperadora() {
        return operadora;
    }

    public void setOperadora(int operadora) {
        this.operadora = operadora;
    }

    public boolean isCameraFrontal() {
        return cameraFrontal;
    }

    public void setCameraFrontal(boolean cameraFrontal) {
        this.cameraFrontal = cameraFrontal;
    }

    public boolean tirarSelfie() {
        return cameraFrontal;
    }

    public boolean ligar(int valor) {
        String operadoraString = Integer.toString(operadora);
        return operadoraString.charAt(0) == valor;
    }

    @Override
    public boolean rodarAplicacao(String valor) {
        return valor.contains(".apk");
    }
}

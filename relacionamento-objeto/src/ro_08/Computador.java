package ro_08;

public class Computador {
    private String numeroSerie;
    private String modeloProcessador;
    private double clockProcessador;
    private boolean isOverclock;
    private int qntdArmazenamento;
    private int qntdMemoria;
    private int consumoFonte;
    private int potenciaFonte;

    public Computador(String numeroSerie, String modeloProcessador, double clockProcessador, int qntdArmazenamento, int qntdMemoria, int consumoFonte, int potenciaFonte) {
        setNumeroSerie(numeroSerie);
        setModeloProcessador(modeloProcessador);
        setClockProcessador(clockProcessador);
        setQntdArmazenamento(qntdArmazenamento);
        setQntdMemoria(qntdMemoria);
        setPotenciaFonte(potenciaFonte);
        setConsumoFonte(consumoFonte);
        if (modeloProcessador.contains("KF") || modeloProcessador.contains("K") || modeloProcessador.contains("X")) {
            setOverclock(true);
        }
    }

    public int getConsumoFonte() {
        return consumoFonte;
    }

    public void setConsumoFonte(int consumoFonte) {
        this.consumoFonte = consumoFonte;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getModeloProcessador() {
        return modeloProcessador;
    }

    public void setModeloProcessador(String modeloProcessador) {
        this.modeloProcessador = modeloProcessador;
    }

    public double getClockProcessador() {
        return clockProcessador;
    }

    public void setClockProcessador(double clockProcessador) {
        this.clockProcessador = clockProcessador;
    }

    public boolean isOverclock() {
        return isOverclock;
    }

    public void setOverclock(boolean overclock) {
        isOverclock = overclock;
    }

    public int getQntdArmazenamento() {
        return qntdArmazenamento;
    }

    public void setQntdArmazenamento(int qntdArmazenamento) {
        this.qntdArmazenamento = qntdArmazenamento;
    }

    public int getQntdMemoria() {
        return qntdMemoria;
    }

    public void setQntdMemoria(int qntdMemoria) {
        this.qntdMemoria = qntdMemoria;
    }

    public int getPotenciaFonte() {
        return potenciaFonte;
    }

    public void setPotenciaFonte(int potenciaFonte) {
        this.potenciaFonte = potenciaFonte;
    }

    public void fazerOverclockProcessador(double incrementoMhz) {

        if (!isOverclock) {
            throw new IllegalArgumentException("Não é possível fazer overclock neste computador");
        }

        double incrementoGhz = incrementoMhz / 1000;
        int contadorConsumo = (int) incrementoMhz / 100;
        int aumentoConsumo = contadorConsumo * 75;

        if (incrementoGhz > clockProcessador * .10) {
            throw new IllegalArgumentException("Acima do valor seguro");
        }

        if (aumentoConsumo > potenciaFonte * .95) {
            throw new IllegalArgumentException("Não foi possível fazer overclock");
        }

        setConsumoFonte(consumoFonte + aumentoConsumo);


    }
}

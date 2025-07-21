package ro_05;

public class Endereco {
    private String logradouro;
    private String complemento;
    private int numero;

    public Endereco(String logradouro, String complemento, int numero) {
        setLogradouro(logradouro);
        setComplemento(complemento);
        setNumero(numero);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro.isBlank()) throw new IllegalArgumentException("Logradouro inválido");
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (complemento.isBlank()) throw new IllegalArgumentException("Complemento inválido");
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0) throw new IllegalArgumentException("Numero inválido");
        this.numero = numero;
    }

    @Override
    public String toString() {
        return logradouro + ", " + complemento + ", " + numero;
    }
}

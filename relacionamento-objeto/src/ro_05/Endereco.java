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
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return logradouro + ", " + complemento + ", " + numero;
    }
}

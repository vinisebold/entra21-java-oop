package exer_8;

public class Contribuinte {
    String nome;
    String cpf;
    String uf;
    double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    private double verificarAliquota() {
        if (rendaAnual < 4000) {
            return 0;
        } else if (rendaAnual < 9000) {
            return 0.058;
        } else if (rendaAnual < 25000) {
            return 0.15;
        } else if (rendaAnual < 35000) {
            return 0.275;
        }

        return 0.30;
    }

    public double calcularImpostoPagar() {
        return rendaAnual * verificarAliquota();
    }
}

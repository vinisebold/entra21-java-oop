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

    public double verificarAliquota() {
        if (rendaAnual < 4000) {
            return 0;
        } else if (rendaAnual > 4001 && rendaAnual < 9000) {
            return 5.8;
        } else if (rendaAnual > 9001 && rendaAnual < 25000) {
            return 15;
        } else if (rendaAnual > 25001 && rendaAnual < 35000) {
            return 27.5;
        } else {
            return 30;
        }
    }
}

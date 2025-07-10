package exer_08;

public class Contribuinte {
    String nome;
    String cpf;
    String uf;
    double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.err.println("Nome inválido");
        } else {
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            System.err.println("CPF inválido");
        } else {
            this.cpf = cpf;
        }

    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2) {
            System.err.println("UF inválida");
        } else {
            this.uf = uf;
        }
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0) {
            System.out.println("Renda anual inválida");
        } else {
            this.rendaAnual = rendaAnual;
        }
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

    public double calcularImpostoDeRenda() {
        return rendaAnual * verificarAliquota();
    }
}

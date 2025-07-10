package exer_11;

public class Livro {

    // Atributos
    private String tituloDoLivro;
    private boolean emprestado;


    // Construtor
    public Livro(String tituloDoLivro, boolean emprestado) {
        setTituloDoLivro(tituloDoLivro);
        setEmprestado(emprestado);
    }

    // Setters
    public void setTituloDoLivro(String tituloDoLivro) {
        if (tituloDoLivro == null || tituloDoLivro.isBlank()) {
            throw new IllegalArgumentException("Erro, título do livro inválido");
        }
        this.tituloDoLivro = tituloDoLivro;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    // Getters
    public boolean getEmprestado() {
        return emprestado;
    }

    public String getTituloDoLivro() {
        return tituloDoLivro;
    }

    public void emprestar() {
        if (getEmprestado()) {
            throw new IllegalArgumentException("Este livro atualmente já está emprestado");
        }
        setEmprestado(true);
    }

    public void devolver() {
        if (!getEmprestado()) {
            throw new IllegalArgumentException("Este livro atualmente já foi devolvido");
        }
        setEmprestado(false);
    }

    @Override
    public String toString() {
        return "[" + getTituloDoLivro() + "] está emprestado? " + getEmprestado();
    }
}

package exerciciosHeranca.Questao3;

public class Livros extends Produto {
    protected String autor;

    public Livros(String nome, double preco, String codigoEAN, String autor) {
        super(nome, preco, codigoEAN);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " Autor: " + autor;
    }
}

package exerciciosHeranca.Questao2;

public class Livros extends Produto{
    protected String autor;
    
    public Livros(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "Autor: " + autor;
    }    
}

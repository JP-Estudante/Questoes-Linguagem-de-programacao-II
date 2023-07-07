package Heranca;

public class Produto {
    protected String nome;
    protected double preco;

    //Exemplo de sobrecarga de métodos
    public Produto(){}

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public boolean eCaro() {
        return (this.preco > 100);
    }

    public void imprimir(){
        System.out.println("Nome: " + nome + " Preço: " + preco);
    }
}

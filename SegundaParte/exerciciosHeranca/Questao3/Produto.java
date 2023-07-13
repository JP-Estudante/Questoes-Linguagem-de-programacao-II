package exerciciosHeranca.Questao3;

public class Produto {
    protected String nome;
    protected double preco;
    protected String codigoEAN;

    public Produto(String nome, double preco, String codigoEAN) {
        this.nome = nome;
        this.preco = preco;
        this.codigoEAN = codigoEAN;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodigoEAN() {
        return this.codigoEAN;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Produto produto = (Produto) obj;
        return codigoEAN.equals(produto.codigoEAN);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Preço: " + preco + "EAN: " + codigoEAN;
    }
}
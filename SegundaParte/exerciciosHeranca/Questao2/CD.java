package exerciciosHeranca.Questao2;

public class CD extends Produto {
    protected int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + "Numero de Faixas: " + numeroFaixas;
    }
}

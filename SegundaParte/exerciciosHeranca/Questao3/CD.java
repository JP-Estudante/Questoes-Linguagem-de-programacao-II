package exerciciosHeranca.Questao3;

public class CD extends Produto {
    protected int numeroFaixas;

    public CD(String nome, double preco, String codigoEAN, int numeroFaixas) {
        super(nome, preco, codigoEAN);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " Numero de Faixas: " + numeroFaixas;
    }
}

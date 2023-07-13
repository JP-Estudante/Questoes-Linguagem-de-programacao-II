package exerciciosHeranca.Questao3;

public class DVD extends Produto {
    int duracaoMin;

    public DVD(String nome, double preco, String codigoEAN, int duracaoMin) {
        super(nome, preco, codigoEAN);
        this.duracaoMin = duracaoMin;
    }

    @Override
    public String toString() {
        return super.toString() + " Duração: " + duracaoMin;
    }
}

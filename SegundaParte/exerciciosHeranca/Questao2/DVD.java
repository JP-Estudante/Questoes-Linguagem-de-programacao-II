package exerciciosHeranca.Questao2;

public class DVD extends Produto {
    int duracaoMin;

    public DVD(String nome, double preco, int duracaoMin) {
        super(nome, preco);
        this.duracaoMin = duracaoMin;
    }

    @Override
    public String toString() {
        return super.toString() + " Duração: " + duracaoMin;
    }
}

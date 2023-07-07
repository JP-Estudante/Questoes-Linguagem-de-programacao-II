package pacote;

public class ContaCorrente extends Conta{
    private double limite;


    public ContaCorrente(int numeroConta, int numeroAgencia, Titular titular, double limite) {
        super(numeroConta, numeroAgencia, titular);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta Corrente {" +
            " limite='" + getLimite() + "'" +
            "}";
    }

}

package pacote;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numeroConta, int numeroAg, Titular titular, double limite) {
        super(numeroConta, numeroAg, titular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return super.toString() + " ContaCorrente{" + "limite=" + limite + '}';
    }
}

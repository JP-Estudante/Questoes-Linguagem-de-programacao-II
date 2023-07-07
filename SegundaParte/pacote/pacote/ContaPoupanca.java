package pacote;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int numeroConta, int numeroAgencia, Titular titular, double rendimento) {
        super(numeroConta, numeroAgencia, titular);
        this.rendimento = rendimento;
    }

}

package pacote;

public abstract class Conta {
    protected int numeroConta, numeroAg;
    protected double saldo;
    protected Titular titular;

    public Conta(int numeroConta, int numeroAg, Titular titular) {
        this.numeroConta = numeroConta;
        this.numeroAg = numeroAg;
        this.titular = titular;
        this.saldo = 0;
    }

    public final void depositar(double valor) {
        saldo += valor;
    }

    public abstract boolean sacar(double valor);

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAg() {
        return numeroAg;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", numeroAg=" + numeroAg + ", saldo=" + saldo + '}';
    }
}

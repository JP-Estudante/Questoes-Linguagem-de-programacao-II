package pacote;

public abstract class Conta {
    protected int numeroConta, numeroAgencia;
    protected double saldo;
    protected Titular titular;

    public Conta(int numeroConta, int numeroAgencia, Titular titular) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.titular = titular;
        this.saldo = 0;
    }

    public final void depositar(double valor){
        saldo += valor;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroAgencia() {
        return this.numeroConta;
    }


    @Override
    public String toString() {
        return "{" +
            " numeroConta='" + getNumeroConta() + "'" +
            ", numeroAgencia='" + getNumeroAgencia() + "'" +
            ", saldo='" + getSaldo() + "}";
    }

}

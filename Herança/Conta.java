package Herança;

public abstract class Conta {

    private int numero, agencia;
    protected double saldo;

    public Conta(int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public String toString() {
        return "{" + " numero ='" + numero + "'" + ", agencia ='" + agencia + "'" + ", saldo ='" + saldo + "'" + "}";
    }

}

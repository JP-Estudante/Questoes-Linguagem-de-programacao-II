package exerciciosHeranca.Questao1;

public class ContaCorrente {
    protected int numero, agencia;
    protected double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        setSaldo(valor);
        System.out.println("Depositado: " + valor);
    }

    public void sacar(double valor) {
        double taxa = valor * 0.005; // Calculando a taxa
        saldo -= (valor + taxa); // Subtraindo o valor mais a taxa
        System.out.println("Sacado: " + valor);   
    }

    public void obterSaldo() {
        System.out.println("Saldo:" + getSaldo());
    }
}

package exerciciosHeranca.Questao1;

public class ContaEspecial extends ContaCorrente{
    public ContaEspecial(double saldo) {
        super(saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.001; // Calculando a taxa
        saldo -= (valor + taxa); // Subtraindo o valor mais a taxa
        System.out.println("Sacado: " + valor);   
    }
}

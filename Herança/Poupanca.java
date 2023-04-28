package Herança;

public class Poupanca extends Conta {

    public Poupanca(int numero, int agencia, double saldo){

        super(numero, agencia, saldo);
    }

    public void saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de "+ valor +" efetuado");
        } else{
            System.out.println("Saldo Insuficiente: ");
        }
    }
}

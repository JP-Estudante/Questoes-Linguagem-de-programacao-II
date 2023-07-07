package pacote;

public class ContaPoupanca extends Conta{
    private double rendimento;

    public ContaPoupanca(int numeroConta, int numeroAg, Titular titular, double rendimento) {
        super(numeroConta, numeroAg, titular);
        this.rendimento = rendimento;
    }
    
    @Override
    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        else
            return false;          
    }

    public double getRendimento() {
        return rendimento;
    }       

    @Override
    public String toString() {
        return super.toString() + " ContaPoupanca{" + "rendimento=" + rendimento + '}';
    }   
    
}

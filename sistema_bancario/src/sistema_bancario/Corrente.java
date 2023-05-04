package sistema_bancario;

public class Corrente extends Conta{
    private double limite;

    Corrente(int numero, int agencia, double saldo, double limite) {
        super(numero, agencia, saldo);
        this.limite = limite;
    }
    
    public void saque(double valor){
        if(this.saldo + this.limite >= valor){
            this.saldo -= valor;
            System.out.println("Saque de "+ valor +" efetuado.");
        }else{
            System.out.println("Saque não realizado. Saldo insuficiente.");
        }
    }   
    
    public String toString() {
        return "Corrente{" + "limite=" + limite + '}';
    }
    
    
}

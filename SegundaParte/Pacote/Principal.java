package pacote;

public class Principal {

    public static void main(String[] args) {
        Titular t1 = new Titular("Roger", "5499999999", "32165498711");
        
        ContaCorrente cc1 = new ContaCorrente(123, 1, t1, 3500);
        ContaPoupanca cp1 = new ContaPoupanca(123, 1, t1, 0.5);
        cc1.depositar(1000);
        
        cp1.depositar(5000);
        
        cp1.sacar(200);
        
        System.out.println(cc1.toString());
        
        System.out.println( cp1.titular.getNome() );
        System.out.println( cp1.getSaldo() ); 
    }
    
}

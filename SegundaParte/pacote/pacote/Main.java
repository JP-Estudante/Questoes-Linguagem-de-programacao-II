package pacote;

public class Main{

    public static void main(String[] args) {
        Titular t1 = new Titular("nome", "fone", "CPF");

        ContaCorrente cr1 = new ContaCorrente(123, 1, t1, 35000000);
        cr1.depositar(1000000000);

        System.out.println(t1.toString());
        System.out.println(cr1.toString());
    }
}
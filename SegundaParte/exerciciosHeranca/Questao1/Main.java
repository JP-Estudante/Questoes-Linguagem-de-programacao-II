/*Crie uma classe para representar uma conta corrente, com métodos para depositar
uma quantia, sacar uma quantia e obter o saldo. Para cada saque será debitada também
uma taxa de operação equivalente à 0,5% do valor sacado. Crie, em seguida, uma
subclasse desta classe anterior para representar uma conta corrente de um cliente
especial. Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado.
Faça testes com as duas classes e verifique seus resultados.
*/
package exerciciosHeranca.Questao1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cr = new ContaCorrente(0);
        ContaEspecial ce = new ContaEspecial(0);

        cr.depositar(100);

        cr.sacar(10);

        cr.obterSaldo();

        System.out.println("\nCliente Especial");

        ce.depositar(100);
        ce.sacar(10);
        ce.obterSaldo();
    }
}

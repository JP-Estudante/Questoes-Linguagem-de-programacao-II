package Exercicios_1.Questao_1;

public class Q_TesteEmpregado {
    public static void main(String[] args) {
        // Criação de duas instâncias da classe Q_Empregado
        Q_Empregado q_empregado1 = new Q_Empregado("Danael", "Damount", 5000.9);
        Q_Empregado q_empregado2 = new Q_Empregado("Silvaene", "Silva", -5660.78);

        // Exibição do salário anual de cada Q_empregado
        System.out.println("Salario anual do Q_Empregado - 1: R$ " + q_empregado1.getSalarioAnual());
        System.out.println("Salario anual do Q_Empregado - 2: R$ " + q_empregado2.getSalarioAnual());

        // Aumento de 10% no salário de cada Q_empregado
        q_empregado1.aumentarSalario(10);
        q_empregado2.aumentarSalario(10);

        // Adiciona somente dois numeros após a virgúla
        String resultado1 = String.format("%.2f", q_empregado1.getSalarioAnual());
        String resultado2 = String.format("%.2f", q_empregado2.getSalarioAnual());

        // Exibição do salário anual atualizado de cada Q_empregado
        System.out.println("Salario anual atualizado do Q_Empregado - 1: R$ " + resultado1);
        System.out.println("Salario anual atualizado do Q_Empregado - 2: R$ " + resultado2);
    }
}

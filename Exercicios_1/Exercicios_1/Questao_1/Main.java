package Exercicios_1.Questao_1;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        // Criação de duas instâncias da classe Q_Empregado
        Q_Empregado q_empregado1 = new Q_Empregado("Danael", "Damount", 5000.9);
        Q_Empregado q_empregado2 = new Q_Empregado("Silvaene", "Silva", -5660.78);

        // Exibição do salário anual de cada Q_empregado
        System.out.println("Salario anual do "+ q_empregado1.getNome() +": R$ " + q_empregado1.getSalarioAnual());
        System.out.println("Salario anual do " + q_empregado2.getNome() + ": R$ " + q_empregado2.getSalarioAnual());

        // Aumento de 10% no salário de cada Q_empregado
        q_empregado1.aumentoSalarial(10);
        q_empregado2.aumentoSalarial(10);

        // Adiciona somente dois numeros após a virgúla
        String resultado1 = String.format("%.2f", q_empregado1.getSalarioAnual());
        String resultado2 = String.format("%.2f", q_empregado2.getSalarioAnual());

        // Exibição do salário anual atualizado de cada Q_empregado
        System.out.println("\nSalario anual atualizado do "+ q_empregado1.getNome() +": R$ " + resultado1);
        System.out.println("Salario anual atualizado do "+ q_empregado1.getNome() +": R$ " + resultado2);
    }
}

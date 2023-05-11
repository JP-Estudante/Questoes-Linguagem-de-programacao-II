package Exercicios_1.Questao_1;

public class Q_Empregado {
    private String nome, sobrenome;
    private double salarioMensal;

    public Q_Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }

    public void aumentarSalario(double percentual) {
        double aumento = salarioMensal * percentual / 100;
        salarioMensal += aumento;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
}

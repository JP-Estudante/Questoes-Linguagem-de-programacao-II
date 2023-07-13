package exerciciosHeranca.Questao4;

public abstract class FormaGeometrica {
    protected double lado;

    public FormaGeometrica(double lado) {
        this.lado = lado;
    }

    public FormaGeometrica() {
        // Construtor sem argumentos
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

package exerciciosHeranca.Questao4;

public class Quadrado extends FormaGeometrica {

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
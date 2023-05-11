package Exercicios_1.Questao_2;

public class Q_Ponto2D {
    private double x;
    private double y;

    public Q_Ponto2D() {
        // Construtor padrão sem parâmetros
        this(0, 0); // Chama o construtor com parâmetros
    }

    public Q_Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void metodoMover(double dX, double dY) {
        x += dX;
        y += dY;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Q_Ponto2D outrPonto2d = (Q_Ponto2D) obj;

        return Double.compare(x, x) == 0 && Double.compare(y, y) == 0;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Q_Ponto2D ponto1 = new Q_Ponto2D();
        Q_Ponto2D ponto2 = new Q_Ponto2D(2.1, 3.6);
       // Q_Ponto2D ponto = new Q_Ponto2D(3.5, 2.8);

        ponto1.metodoMover(1.2, -0.5); // Movimenta o ponto1 em (1.2, -0.5)
        double x = ponto2.getX(); // Obtém o valor de x do ponto2
        ponto2.setY(4.2); // Define o valor de y do ponto2 como 4.2

        boolean saoIguais = ponto1.equals(ponto2); // Verifica se ponto1 e ponto2 são iguais
        System.out.println(saoIguais); // Saída: false

        System.out.println(ponto2);
    }
}

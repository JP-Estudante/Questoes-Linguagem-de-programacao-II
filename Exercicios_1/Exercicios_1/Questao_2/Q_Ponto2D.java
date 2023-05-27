package Exercicios_1.Questao_2;

import java.text.DecimalFormat;

public class Q_Ponto2D {
    private double x;
    private double y;

    public Q_Ponto2D() {
        // Construtor padrão sem parâmetros
        this(0, 0); // Chama o construtor com parâmetros, definindo o ponto na origem (0, 0)
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
        x += dX; // Move o ponto na direção do eixo x adicionando dX à sua coordenada x
        y += dY; // Move o ponto na direção do eixo y adicionando dY à sua coordenada y
    }

    @SuppressWarnings("unused")
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Se os objetos são idênticos, eles são iguais
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Se o objeto é nulo ou não é da mesma classe, eles são diferentes
        }

        Q_Ponto2D outroPonto2D = (Q_Ponto2D) obj;

        return Double.compare(x, x) == 0 && Double.compare(y, y) == 0; // Compara as coordenadas x e y dos dois pontos
    }

    public double calcularDistancia(Q_Ponto2D outroPonto2D) {
        double difX = this.x - outroPonto2D.x; // Calcula a diferença entre as coordenadas x dos dois pontos
        double difY = this.y - outroPonto2D.y; // Calcula a diferença entre as coordenadas y dos dois pontos
        return Math.sqrt(difX * difX + difY * difY); // Calcula a distância usando o Teorema de Pitágoras
    }

    public String toString() {
        return "(" + x + ", " + y + ")"; // Representação textual do ponto no formato (x, y)
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Q_Ponto2D ponto1 = new Q_Ponto2D(); // Criação de um objeto ponto1 usando o construtor padrão
        Q_Ponto2D ponto2 = new Q_Ponto2D(2.1, 3.6); // Criação de um objeto ponto2 com valores específicos

        // ponto1.metodoMover(1.2, -0.5);
        ponto1.metodoMover(1.2, -0.5); // Movimenta o ponto1 em (1.2, -0.5)

        // double x = ponto2.getX();
        double x = ponto2.getX(); // Obtém o valor de x do ponto2

        // ponto2.setY(4.2);
        ponto2.setY(4.2); // Define o valor de y do ponto2 como 4.2

        // boolean saoIguais = ponto1.equals(ponto2);
        boolean saoIguais = ponto1.equals(ponto2); // Verifica se ponto1 e ponto2 são iguais

        // System.out.println(saoIguais);
        System.out.println(saoIguais); // Saída: false

        // System.out.println(ponto2);
        System.out.println(ponto2); // Imprime a representação do objeto ponto2 como uma String

        // double distancia = ponto1.calcularDistancia(ponto2);
        double distancia = ponto1.calcularDistancia(ponto2); // Calcula a distância entre ponto1 e ponto2

        // DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df = new DecimalFormat("0.00"); // Cria um objeto DecimalFormat para formatar a distância

        // String distanciaFormatada = df.format(distancia);
        String distanciaFormatada = df.format(distancia); // Formata a distância com duas casas decimais

        // System.out.println("A distancia é de: " + distanciaFormatada);
        System.out.println("A distancia é de: " + distanciaFormatada); // Imprime a distância formatada
    }
}

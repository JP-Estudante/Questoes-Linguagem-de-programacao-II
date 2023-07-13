package exerciciosHeranca.Questao4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas formas deseja criar? ");
        int quantidadeFormas = scanner.nextInt();

        FormaGeometrica[] formas = new FormaGeometrica[quantidadeFormas];

        for (int i = 0; i < quantidadeFormas; i++) {
            System.out.println("Forma #" + (i + 1));
            System.out.println("Qual forma deseja criar? (1 - Quadrado, 2 - Retângulo, 3 - Círculo)");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    formas[i] = new Quadrado(lado);
                    break;
                case 2:
                    System.out.print("Digite a base do retângulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    formas[i] = new Retangulo(base, altura);
                    break;
                case 3:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    formas[i] = new Circulo(raio);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    i--; // Decrementa o contador para repetir a iteração
                    break;
            }
        }

        System.out.println("========================================");
        System.out.println("Resultados:");
        System.out.println("========================================");

        for (int i = 0; i < quantidadeFormas; i++) {
            FormaGeometrica forma = formas[i];

            System.out.println("Forma #" + (i + 1));

            if (forma instanceof Quadrado) {
                Quadrado quadrado = (Quadrado) forma;
                System.out.println("Lado: " + quadrado.getLado());
            } else if (forma instanceof Retangulo) {
                Retangulo retangulo = (Retangulo) forma;
                System.out.println("Base: " + retangulo.getBase());
                System.out.println("Altura: " + retangulo.getAltura());
            } else if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                System.out.println("Raio: " + circulo.getRaio());
            }

            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("----------------------------------------");
        }
    }
}

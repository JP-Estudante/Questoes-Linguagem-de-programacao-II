package Exercicio_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Carro novoCarro = new Carro();

        ArrayList<Carro> carros = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int menu = 0, ano;
        String modelo, placa, fabricante, cor, buscaPlaca;

        do {
            System.out.print("\033[H\033[2J");

            System.out.println("======= Menu =======");
            System.out.println("1 - Inserir carro");
            System.out.println("2 - Buscar carro[placa]");
            System.out.println("3 - Listar carros");
            System.out.println("4 - Listar carros[fabricante]");
            System.out.println("5 - Listar carros[ano]");
            System.out.println("6 - Excluir carro");
            System.out.println("0 - Sair");
            System.out.print(">>> ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    // Ler todos os dados do carro
                    System.out.print("\nModelo: ");
                    modelo = input.next();

                    System.out.print("\nPlaca: ");
                    placa = input.next();

                    System.out.print("\nFabricante: ");
                    fabricante = input.next();

                    System.out.print("\nCor: ");
                    cor = input.next();

                    System.out.print("\nAno: ");
                    ano = input.nextInt();

                    Carro novoCarro = new Carro(modelo, placa, fabricante, cor, ano);
                    System.out.println("Nome do novo carro: ");
                    carros.add(novoCarro);
                    break;

                case 2:
                    System.out.println("Placa do carro a ser buscado: ");
                    buscaPlaca = input.next();
                    boolean encontrado = false; // Variável para verificar se o carro foi encontrado na lista

                    for (Carro carro : carros) {
                        if (carro.getPlaca().equalsIgnoreCase(buscaPlaca)) {
                            System.out.println("Carro encontrado: ");
                            System.out.println("Modelo: " + carro.getModelo());
                            System.out.println("Placa: " + carro.getPlaca());
                            System.out.println("Fabricante: " + carro.getFabricante());
                            System.out.println("Cor: " + carro.getCor());
                            System.out.println("Ano: " + carro.getAno());
                            encontrado = true; // Marca que o carro foi encontrado
                            break; // Sai do loop, pois o carro foi encontrado
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Carro não encontrado na lista.");
                    }
                    break;

                default:
                    break;
            }
        } while (menu == 0);

        input.close();
    }
}

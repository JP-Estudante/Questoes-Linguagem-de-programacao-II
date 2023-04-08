package Exemplo_ArrayList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList_3 {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();
        int opcao;
        String novoCarro, excluir, trocar, busca;
        // Criando Scanners
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.print("\033[H\033[2J");

            System.out.println("Selecione uma opção");
            System.out.println("1 - Novo carro");
            System.out.println("2 - Exibir carros");
            System.out.println("3 - Excluir carros");
            System.out.println("4 - Alterar carro");
            System.out.println("5 - Buscar carro");
            System.out.println("0 - Sair");
            System.out.print(">>> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: // caso para adcionar um novo carro
                    System.out.println();
                    System.out.print("Insira o nome do carro: ");
                    novoCarro = entrada.next();
                    carros.add(novoCarro);
                    break;

                case 2: // caso para exibir todos caros
                    System.out.println();
                    System.out.println("***Lista de Carros***");
                    for (String carro : carros) {
                        System.out.println(carro);
                    }
                    System.out.println();
                    System.out.print("Pressione uma tecla para continuar...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println();
                    for (String carro : carros) {
                        System.out.println(carro);
                    }
                    System.out.print("Digite o carro que deseja apagar: ");
                    excluir = entrada.next();
                    try {
                        carros.remove(excluir);
                    } catch (Exception e) {
                        System.out.println("Erro ao Excluir: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println();
                    for (String carro : carros) {
                        System.out.println(carro);
                    }
                    System.out.println();
                    System.out.println("***Insira o carro a ser alterado***");
                    System.out.print("Trocar: ");
                    trocar = entrada.next();

                    if (carros.contains(trocar)) {
                        System.out.println();
                        System.out.println("***Insira o novo carro***");
                        System.out.print("Por: ");
                        novoCarro = entrada.next();
                        int index = carros.indexOf(trocar);

                        carros.set(index, novoCarro);
                        System.out.println("Lista Alterada");

                        for (String carro : carros) {
                            System.out.println(carro);
                        }
                    } else {
                        System.out.println();
                        System.out.println("O carro " + trocar + " não foi encontrado na lista.");
                        System.out.println();
                        System.out.print("Pressione uma tecla para continuar...");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.print("Digite o carro a buscar: ");
                    busca = entrada.next();
                    System.out.println();

                    if (carros.contains(busca)) {
                        System.out.println("Item encontrado na lista");
                        System.out.println();
                        System.out.print("Pressione uma tecla para continuar...");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Item não encontrado na lista");
                        System.out.println();
                        System.out.print("Pressione uma tecla para continuar...");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 0:
                    System.out.println();
                    System.out.println("Fechando Programa...");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
        entrada.close();
    }
}

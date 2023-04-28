package Exercicio_POO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Carro novoCarro = new Carro();

        ArrayList<Carro> carros = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int menu = 0, ano, dadosCarro, j, buscarAno;
        String modelo, placa, fabricante, cor, buscaPlaca, buscarFabricante;
        boolean fabricanteEncontrado, anoEncontrado;

        do {
            System.out.print("\033[H\033[2J"); //limpa a tela

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
                case 0: //caso para fechar o programa
                    System.out.println("Fechando Programa");
                    break;

                case 1: //caso para inserir um carro à lista
                    // Ler todos os dados do carro
                    System.out.println("\n======= Insira os dados do novo carro =======");
                    System.out.println("\nO modelo definirá o nome do carro na lista");
                    System.out.print("Modelo: ");
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
                    carros.add(novoCarro);
                    break;

                case 2: //caso para buscar o carro pela placa
                    System.out.print("Placa do carro a ser buscado: ");
                    buscaPlaca = input.next();
                    boolean encontrado = false; // Variável para verificar se o carro foi encontrado na lista

                    for (Carro carro : carros) {
                        if (carro.getPlaca().equalsIgnoreCase(buscaPlaca)) {
                            System.out.println("[AVISO] Carro Encontrado...");
                            System.out.println("Modelo: " + carro.getModelo());
                            System.out.println("Placa: " + carro.getPlaca());
                            System.out.println("Fabricante: " + carro.getFabricante());
                            System.out.println("Cor: " + carro.getCor());
                            System.out.println("Ano: " + carro.getAno());
                            encontrado = true; // Marca que o carro foi encontrado
                            System.out.print("\nPressione uma tecla para continuar...");
                            try {
                                System.in.read();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break; // Sai do loop, pois o carro foi encontrado
                        }
                    }

                    if (!encontrado) {
                        System.out.println("\n[AVISO] Carro NÃO Encontrado...");
                        System.out.print("\nPressione uma tecla para continuar...");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3: //caso para listar os carros inseridos
                    System.out.println("\n======= Lista dos carros =======");

                    for (j = 0; j < carros.size(); j++) {
                        System.out.println(" " + (j + 1) + " - " + carros.get(j).getModelo());
                    }

                    System.out.println("\nDigite o numero do carro da lista para ver os dados do carro");
                    System.out.print("ou 0 para retornar ao menu: ");
                    dadosCarro = input.nextInt();

                    if (dadosCarro > 0 && dadosCarro <= carros.size()) {
                        Carro carroSelecinado = carros.get(dadosCarro - 1);
                        System.out.println("\n======= Dados do carro =======");
                        System.out.println("Modelo: " + carroSelecinado.getModelo());
                        System.out.println("Placa: " + carroSelecinado.getPlaca());
                        System.out.println("Fabricante: " + carroSelecinado.getFabricante());
                        System.out.println("Cor: " + carroSelecinado.getCor());
                        System.out.println("Ano: " + carroSelecinado.getAno());

                    } else if (dadosCarro == 0) {
                        break;

                    } else {
                        System.out.println("[AVISO] Carro não encontrado");

                        System.out.print("\nPressione uma tecla para continuar...");
                        try {
                            System.in.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        continue; // Volta ao início do laço do case 3
                    }

                    System.out.print("\nPressione uma tecla para continuar...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4: //caso para listar os carros do mesmo fabricante
                    System.out.print("\nInforme o fabricante: ");
                    buscarFabricante = input.next();

                    fabricanteEncontrado = false; // Variável de controle
                    for (Carro carro : carros) {

                        if (carro.getFabricante().equalsIgnoreCase(buscarFabricante)) {
                            fabricanteEncontrado = true;
                            System.out.println(carro.getModelo());

                        }
                    }
                    if (!fabricanteEncontrado) {
                        System.out.println("\n[AVISO] Fabricante não encontrado");

                    }
                    System.out.print("\nPressione uma tecla para continuar...");
                    try {
                        System.in.read();

                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                    break;

                case 5: //caso para listar os carros do mesmo ano
                    System.out.print("\nInforme o ano: ");
                    buscarAno = input.nextInt();

                    anoEncontrado = false; // Variavel de controle
                    for (Carro carro : carros) {
                        if (carro.getAno() == buscarAno) {
                            anoEncontrado = true;
                            System.out.println(carro.getModelo());
                        }
                    }
                    if (!anoEncontrado) {
                        System.out.println("\n[AVISO] Ano não encontrado");
                    }

                    System.out.print("\nPressione uma tecla para continuar...");
                    try {
                        System.in.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 6: //caso para excluir um carro da lista
                    System.out.print("\nDigite o modelo à excluir: ");
                    String excluirModelo = input.next(); // Declaração como final

                    boolean carroRemovido = carros.removeIf(carro -> carro.getModelo().equalsIgnoreCase(excluirModelo));

                    if (carroRemovido) {
                        System.out.println("Carro excluído com sucesso.");

                    } else {
                        System.out.println("Carro não encontrado na lista.");

                    }

                    System.out.print("\nPressione uma tecla para continuar...");
                    try {
                        System.in.read();

                    } catch (IOException e) {
                        e.printStackTrace();

                    }
                    break;

                default: //cria um loop no programa se digitado um numero que não está no menu
                    continue;
            }
        } while (menu != 0);
        input.close();
    }
}

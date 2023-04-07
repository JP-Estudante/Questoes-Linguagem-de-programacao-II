package Exemplo_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList_3 {
    public static void main(String[] args) {
        
    ArrayList<String> carros = new ArrayList<>();
    int opcao;
    String novoCarro;
    //Criando Scanners
    Scanner entrada = new Scanner(System.in);
    
    do{
        System.out.println();
        System.out.println("Selecione uma opção");
        System.out.println("1 - Novo carro");
        System.out.println("2 - Exibir carros");
        System.out.println("3 - Excluir carros");
        System.out.println("4 - Alterar carro");
        System.out.println("0 - Sair");
        System.out.print(">>> ");
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 1: //caso para adcionar um novo carro
            System.out.println();
            System.out.print("Insira o nome do carro: ");
            novoCarro = entrada.next();

            carros.add(novoCarro);
                
                break;
                
                case 2: //caso para exibir todos caros
                System.out.println();
                System.out.println("***Lista de Carros***");
                for (String carro: carros){
                    System.out.println(carro);
                }
                System.out.println("Pressione uma tecla para continuar...");
                entrada.next();
                break;

                case 3:
                break;
                
                case 0:
                System.out.println("Fechando Programa...");
                break;

                default:
                System.out.println("Opção Inválida");
            }
        }while (opcao != 0);

        entrada.close();
    }
}

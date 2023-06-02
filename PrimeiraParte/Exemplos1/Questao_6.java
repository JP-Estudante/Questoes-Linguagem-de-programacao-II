package PrimeiraParte.Exemplos1;

import java.util.Scanner;

public class Questao_6{
    public static void main(String[] args){
    
        int numero;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Digite um valor entre 1 e 5");
            numero = teclado.nextInt();

        }while (numero < 1 || numero > 5);
        
        teclado.close();
    }
}
package PrimeiraParte.Exemplos1;

import java.util.Random;
import java.util.Scanner;


public class Questao_7 {
    
    public static void main(String[] args) {
        int numUsuario, numSorteado, numTentativa = 0;
        Scanner teclado = new Scanner(System.in);

        Random rnd = new Random();
        numSorteado = rnd.nextInt(21);

        System.out.println(numSorteado);

        do{
            System.out.println("Tentativas: " + numTentativa);
            System.out.println();
            System.out.print("Informe um valor entre 0 e 20: ");
            numUsuario = teclado.nextInt();
            numTentativa ++;

            if(numUsuario == numSorteado){
                System.out.println("Valor Correto!!! ");
                System.out.println("Tentativas: " + numTentativa++);

            }else if(numUsuario < numSorteado){
                System.out.println("Valor menor que o digitado!");

            }else{
                System.out.println("Valor maior que o digitado! ");

            }
        
        }while(numUsuario != numSorteado);

        teclado.close();
    }
}

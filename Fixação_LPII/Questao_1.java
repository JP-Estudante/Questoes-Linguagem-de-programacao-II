/*Crie um programa em Java que leia um número qualquer e informe se ele é par ou
ímpar.*/

package Fixação_LPII;

import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");

        } else {
            System.out.println("Ímpar");

        }

        entrada.close();
    }
}
/*Fa�a um programa que leia um n�mero inteiro e verifique se o n�mero � divis�vel por 5 e por 3 ao mesmo tempo.*/

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int i, somaDosAlgarismos = 0;
    char num[999]; //Numero digitado

    printf("Entrada do Numero: ");
        scanf("%s", num);

    int tamanhoNum = strlen(num); //"strlen(num);" utilizada para medir o tamanho da string e armazenar na vari�vel "tamanhoNum"
    if (num[tamanhoNum-1] == '5' || num[tamanhoNum-1] == '0' ){//se "num" terminar com 5 ou 0 continua, se n�o ELSE...

        //la�o para fazer a soma dos numeros digitados onde '\0' e o "ponto final" da string
        for(i = 0; num[i] != '\0'; i++){ //soma o algarismo recebe a variavel num que faz a subtra��o do numero em codigo ASCII
            somaDosAlgarismos += num[i] - '0'; //Ex.: '0' vale 48 em ASCII; '1' vale 49 em ASCII; 
        }                                     //Faz a subtra��o de 49 - 48 = 1 que e o caracter digitado pelo usuario

            if (somaDosAlgarismos % 3 == 0) {   //Verifica se � divisivel por 3

        printf("O numero � divis�vel por 5 e por 3 ao mesmo tempo.\n");

        } else {
            printf("O n�mero n�o � divis�vel por 3 e 5 ao mesmo tempo.\n");
        }
    }else {
        printf("\nPara um n�mero ser divis�vel por 3 e 5 ao mesmo tempo,");
        printf("\n�ltimo d�gito deve ser 5 ou 0, e n�o e o caso do n�mero digitado\n");
    }
    return 0;
}
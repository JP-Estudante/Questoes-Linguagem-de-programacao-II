/*Fa�a um programa que calcule a m�dia de 10 n�meros informados pelo usu�rio utilizando o comando while.*/

#include <stdlib.h>
#include <stdio.h>

int main(){
    int i, num, media = 0, result;
    while(i != 10){
        i++;

    printf("\nInforme o %d numero: ",i);
        scanf("%d", &num);
        media = num + media;
}
    result = media / 10;
    printf("A media dos 10 numeros e: %d",result);
}

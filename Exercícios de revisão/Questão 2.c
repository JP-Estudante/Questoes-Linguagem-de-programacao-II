/*Fa�a um programa que calcule a m�dia de 10 n�meros informados pelo usu�rio utilizando o comando while.*/

#include <stdlib.h>
#include <stdio.h>

int main(){
    
    int i = 1, num, media = 0, result;
    
    while(i != 11){
        
        printf("\nInforme o %d numero: ",i);
        scanf("%d", &num);
        
        media = num + media;
        
        i++;
    }
    result = media / 10;  
    printf("A media dos 10 numeros e: %d",result);
}
/*Fa�a um programa que verifique se um n�mero informado pelo usu�rio � positivo, negativo ou zero.*/

#include <stdlib.h>
#include <stdio.h>

int main(){
    int num;
    printf("Informe um numero: ");
        scanf("%d", &num);

        if (num > 0){
            printf("Positivo");
        }else if(num < 0){
            printf("Negativo");
        }else{
            printf("Zero");
        }
}
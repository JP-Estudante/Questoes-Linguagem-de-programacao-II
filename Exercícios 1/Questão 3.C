/*Crie uma fun��o que recebe um n�mero inteiro e verifica se ele � positivo, negativo ou zero.*/

#include <stdio.h>

int num;
int verificaNum();

int main(){
    printf("Digite um numero inteiro: ");
        scanf("%d", &num);

    verificaNum();
}

int verificaNum(){
    
    if (num == 0){
        printf("Zero");

    }else if(num < 0){
        printf("Negativo");

    }else if(num > 0){
        printf("Positivo");

    }

    return num;
}
/*Fa�a um programa que leia tr�s n�meros inteiros e imprima o maior e o menor entre eles.*/

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int i = 1, num[3], maior = 0, menor = 0;
    do{
    printf("%d� Numero: ", i);
    scanf("%d", &num[i-1]);
    i++;

    }while(i <= 3);

    if (num[0] > num[1] && num[0] > num[2]){
        maior = num[0];
    }

    if (num[1] > num[0] && num[1] > num[2]){
        maior = num[1];
    }

    if (num[2] > num[1] && num[2] > num[0]){
        maior = num[2];
    }

    if (num[0] < num[1] && num[0] < num[2]){
        menor = num[0];
    }

    if (num[1] < num[0] && num[1] < num[2]){
        menor = num[1];
    }

    if (num[2] < num[1] && num[2] < num[0]){
        menor = num[2];
    }
    printf("\nDos n�meros digitado:\n");
    printf("\n%d � o menor", menor);
    printf("\n%d � o maior", maior);
}
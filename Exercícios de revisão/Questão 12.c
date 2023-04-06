/*Escrever um programa que leia, valores inteiros, at� ser lido o valor-99. Quando isso acontecer
o programa dever� escrever a soma e a m�dia dos valores lidos.*/

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "Portuguese");
    int num[99], i, soma = 0, count = 0;
    float media;
    for (i = 0; i < 99; i++){
        printf("Digite o %d� valor: ",i+1);
        scanf("%d",&num[i]);

        soma += num[i];
        count++;
    }
    printf("A soma: %d\n", soma);
    if (count > 0) {
        media = (float)soma/count;
        printf("A m�dia: %.2f\n", media);
    } else {
        printf("Nenhum valor v�lido foi lido.\n");
    }
    return 0;
}
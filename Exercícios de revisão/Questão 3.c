/*Fa�a um programa que calcule a �rea de um ret�ngulo, cujos valores da base e altura s�o informados pelo usu�rio.*/

#include <stdlib.h>
#include <stdio.h>

int main(){
    int area, base, altura;
    printf("informe a base: ");
    scanf("%d",&base);

    printf("informe a altua: ");
    scanf("%d",&altura);

    printf("\n\n");

    area = base * altura;

    printf("Base: %d * Altura: %d = Area: %d", base, altura, area);
}

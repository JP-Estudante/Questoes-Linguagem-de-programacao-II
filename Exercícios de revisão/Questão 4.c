/*Fa�a um programa que verifique se um n�mero informado pelo usu�rio � par ou �mpar.*/

#include <stdlib.h>
#include <stdio.h>

int main(){
    int num;

    printf("Numero: ");
        scanf("%d", &num);

        if (num %2 == 0){
            printf("Numero Par");
        }else{
            printf("Numero Impar");
        }
}

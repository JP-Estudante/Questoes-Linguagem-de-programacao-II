/*Fa�a uma fun��o em C que receba um n�mero inteiro e imprima a tabuada de multiplica��o desse n�mero at� o 10.*/

#include <stdio.h>

int num;
int tabuada();

int main(){
    printf("Informe um numero: ");
        scanf("%d", &num);
    
    tabuada();
}

int tabuada(){
    int resul;
    for (int i = 0; i < 11; i++){
        resul = i * num;
        printf("%d x %d = %d\n", i, num, resul);
    }

    return resul;
}
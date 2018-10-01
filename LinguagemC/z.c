#include <stdio.h>

int main(){
    int numero;

    printf("Informe um numero: ");
    scanf("%d", &numero);

    if(numero % 2 == 0){
        printf("numero par: %d", numero);
    }else{
        printf("numero impar: %d", numero);
    }
}



#include <stdio.h>

int main(){

    int n, maior = 0;

    printf("Informe um numero: ");
    scanf("%d", &n);

    while(n != 0){
        if(n > maior){
            maior = n;
        }
        printf("Informe um numero: ");
        scanf("%d", &n);

    }
    printf("O maior numero e %d", maior);


}

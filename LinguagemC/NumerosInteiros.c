#include <stdio.h>

    int main(){
       int numero;
       printf("Informe um numero inteiro: ");
       scanf("%d", &numero);

       if(numero % 2 == 0){
         printf("O numero %d e par\n", numero);
       }else{
         printf("O numero %d e impar\n", numero);
       }
       if(numero > 0){
         printf("O numero %d e maior que zero", numero);
       }else{
         printf("O numero %d e menor que zero", numero);
       }
}

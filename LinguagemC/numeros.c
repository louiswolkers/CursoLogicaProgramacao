#include <stdio.h>

  int main(){
      int numero, a, b;
      printf("Informe um numero: ");
      scanf("%d", &numero);

      if (numero > 0){
           a = numero;
           printf("O %d numero e positivo.", numero);
      }else{
           b = numero;
           printf("O %d numero e negativo.", numero);
      }



}

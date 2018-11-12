#include <stdio.h>

    int main(){

      float indice;

      printf("Informe o indice de poluicao: ");
      scanf("%f", &indice);

      if(indice >= 0.3 && indice < 0.4){
         printf("Atencao: I00,ndustrias do 1o grupo, devem suspender as atividades.");
      }else if(indice >= 0.4 && indice < 0.5){
            printf("Atencao: Industridas do 1o e 2o grupos devem suspender as atividades");
      }else if(indice >= 0.5){
            printf("Atencao: Todos os grupos devem suspender as atividades.");
      }


    }


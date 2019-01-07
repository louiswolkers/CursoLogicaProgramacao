#include <stdio.h>

int main(){

    float indice;

    printf("Informe o indice de posuicao: ");
    scanf("%f", &indice);

    if(indice >= 0.3 && indice < 0.4){
        printf("Atencao: industrias do 1o grupo devem suspender as atividades. ");
    }else if(indice >= 0.4 && indice < 0.5){
        printf("Atencao: industrias do 1o e 2o grupo devem suspender as atividades. ");
    }else if(indice >= 0.5){
        printf("Atencao: Todos os grupos devem suspender as atividades. ");
    }

}

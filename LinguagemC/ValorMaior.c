#include <stdio.h>

int main(){
    int valor, maior = -999, menor = 999, soma = 0;
    float media;

    for (int i = 0; 1 < 10; i++){
        printf("Informe um valor: ");
        scanf("%d", &valor);
        if(valor > 0){
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
            soma = soma + valor;
        }else{
            i --;
        }
    }
    media = soma / 10;
    printf("O maior numero e %d\n", maior);
    printf("O menor numero e %d\n", menor);
    printf("A media dos numeros e %2.f", media);
}

#include <stdio.h>

int main(){
    float valor_por_hora, salario;
    int horas_trabalhadas;

    printf("Qual valor voce ganha por hora? ");
    scanf("%f", &valor_por_hora);

    printf("Quantas horas voce trabalhou neste mes? ");
    scanf("%d", &horas_trabalhadas);

    salario = (horas_trabalhadas * valor_por_hora);

    printf("Neste mes voce vai receber R$ %.2f", salario);
}

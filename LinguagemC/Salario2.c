#include <stdio.h>

int main(){

    int c;
    float horas_trabalhadas, excesso = 0, horas_extras = 20.00, salario, valor_hora = 10.00;

    printf("Informe o codigo: ");
    scanf("%d",&c);
    printf("Informe a quantidade de horas trabalhadas: ");
    scanf("%f", &horas_trabalhadas);

    if(horas_trabalhadas > 50){
       excesso = (horas_trabalhadas - 50) * horas_extras;
       salario = (50 * valor_hora) + excesso;

       printf("Salario Total R$ %.2f\n", salario);
       printf("Salario excedente R$ %.2f", excesso);
     }else{
       salario = horas_trabalhadas * valor_hora;
       printf("Salario Total R$ %.2f\n", salario);
       printf("Salario excedente: R$ %.2f", excesso);
    }
}

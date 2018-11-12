#include <stdio.h>

int main(){
    int n1, n2, n3, n4, q1, q2, q3, q4;
    printf("Informe o primeiro numero: ");
    scanf("%d", &n1);
    printf("Informe o segundo numero: ");
    scanf("%d", &n2);
    printf("Informe o terceiro numero: ");
    scanf("%d", &n3);
    printf("Informe o quarto numero: ");
    scanf("%d", &n4);
    q1 = n1 * n1;
    q2 = n2 * n2;
    q3 = n3 * n3;
    q4 = n4 * n4;
    if(q3 >= 3){
       printf("%d Ao quadrado e: %d", n3, q3);
    }else{
       printf("%d Ao quadrado e: %d\n", n1, q1);
       printf("%d Ao quadrado e: %d\n", n2, q2);
       printf("%d Ao quadrado e: %d\n", n3, q3);
       printf("%d Ao quadrado e: %d\n", n4, q4);
    }

}

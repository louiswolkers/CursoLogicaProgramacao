#include <stdio.h>
#include <string.h>

int main(){
    char nome[100], senha [100];

    printf("Informe o nome: ");
    gets(nome);
    printf("Informe a senha: ");
    gets(senha);

    while(!strcmp(nome, senha)){
        printf("Nome do usuario e senha devem ser diferentes.\n");
        printf("Informe o nome: ");
        gets(nome);
        printf("Informe a senha: ");
        gets(senha);
    }
}

package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int valor, maior = -999, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			valor = teclado.nextInt();
			
			if(valor > 0) {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
				soma = soma + valor;
			}else{
				i--;
			}
		}
		media = soma / 10;
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("O menor n�mero �: " + menor);
		System.out.println("A m�dia dos n�meros �: " + media);
		teclado.close();
	}

}

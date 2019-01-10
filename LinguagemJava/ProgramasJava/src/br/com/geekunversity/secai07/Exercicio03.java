package br.com.geekunversity.secai07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.printf("Informe o valor");
			vetor[i] = teclado.nextInt();
			soma = soma + vetor[i];
		}
		System.out.printf("A soma é: " + soma);
		teclado.close();
	}

}

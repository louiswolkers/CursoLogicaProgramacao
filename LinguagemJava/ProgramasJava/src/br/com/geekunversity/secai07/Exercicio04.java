package br.com.geekunversity.secai07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o valor para o vetor %d/10\n", (i+1));
			vetor[i] = teclado.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("O n�mero %d est� na posi��o %d\n", vetor[i], i);
				tem_maior_50 = true;
			}
		}
		if(!tem_maior_50) {
			System.out.println("N�o existe nenhum n�mero maior do que 50");
		}
		teclado.close();

	}

}

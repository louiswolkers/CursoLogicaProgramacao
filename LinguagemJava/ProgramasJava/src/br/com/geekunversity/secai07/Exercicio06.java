package br.com.geekunversity.secai07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		float[] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um c�digo: ");
		codigo = teclado.nextInt();
		
		if(codigo != 0) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um n�mero real: ");
				vetor[i] = teclado.nextFloat();			
			}
			if(codigo == 1) {
				for (int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
				}
			}
			if(codigo == 2) {
				for (int i = (vetor.length - 1); i >= 0; i--) {
					System.out.println(vetor[i]);
				}
			}
		}
		
		teclado.close();
	}

}

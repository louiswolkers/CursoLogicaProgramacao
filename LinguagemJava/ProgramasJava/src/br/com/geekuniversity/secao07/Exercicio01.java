package br.com.geekuniversity.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		n = teclado.nextInt();
		while(n != 0) {
			if(n > maior) {
				maior = n;
			}
			System.out.println("Informe um número: ");
			n = teclado.nextInt();
		}
		System.out.println("O maior número é: " + maior);
		teclado.close();
	}

}

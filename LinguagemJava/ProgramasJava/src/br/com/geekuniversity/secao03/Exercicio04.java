package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro núimero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo núimero: ");
		num2 = teclado.nextInt();
		
		soma = (num1 + num2);
		System.out.println("A soma é " + soma);
		
		teclado.close();
		
	}
}

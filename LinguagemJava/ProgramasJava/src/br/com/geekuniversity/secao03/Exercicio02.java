package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, soma, multiplicacao;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
		teclado.close();
	}

}

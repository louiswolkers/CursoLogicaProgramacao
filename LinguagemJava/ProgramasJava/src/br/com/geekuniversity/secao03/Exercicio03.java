package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade m�nima: ");
		quantidade_minima = teclado.nextInt();
		System.out.println("Informe a quantidade maxima: ");
		quantidade_maxima = teclado.nextInt();
		
		estoque_medio = (quantidade_maxima + quantidade_minima) /2;
		
		System.out.println("O estoque m�dio � " + estoque_medio);
		teclado.close();
		
		
		
	}

}

package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();
		peso_ideal = (float)(altura * 72.7) - 58;
		System.out.println("Seu peso ideal seria: " + peso_ideal);
		teclado.close();

	}

}

package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o peso dos peixes: ");
		p = teclado.nextFloat();
		
		if(p > 50) {
			m = (float)(p - 50) * (float)4.00;
			System.out.printf("Voc� dever� pagar R$ " + m);
		}else{
			m = 0;
			e = "0";
			System.out.println("Multas: " + m);
			System.out.println("Excesso " + e);
		}
		teclado.close();
	}

}

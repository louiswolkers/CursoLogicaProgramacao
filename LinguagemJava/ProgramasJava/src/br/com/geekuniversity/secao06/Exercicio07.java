package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			if(numero > 0) {
					System.out.println("O n�mero que voc� digitou � par e positivo. \n ");
			}else{
				System.out.println("O n�mero que voc� digitou � par e negativo. \n");
			}	
		}else{
			if(numero > 0) {
				System.out.println("O n�mero que voc� digitou � impar e positivo. \n");
			}else{
				System.out.println("O n�mero que voc� digitou � impar e negativo. \n");
			}
			teclado.close();
		}

	}

}

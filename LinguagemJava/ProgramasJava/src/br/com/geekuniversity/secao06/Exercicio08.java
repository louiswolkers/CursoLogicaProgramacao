package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		float indice;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o �ndice de polui��o: ");
		indice = teclado.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Aten��o: Ind�strias do 1o grupo devem suspender as atividade.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Aten��o: Ind�strias do 1o e 2o grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println("Aten��o: Todos os grupodes devem suspender as atividades.");
		}
		teclado.close();
		
	}

}

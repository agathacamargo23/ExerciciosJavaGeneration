package br.com.aulajava.pratica;

import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses,dias ;
		
		System.out.println("Idade expressa em dias. ");
		
				
		System.out.println("Agora informe seu ano de nascimento: ");
		anos = leia.nextInt();
		
		System.out.println("Agora informe os meses: ");
		meses = leia.nextInt();
		
		System.out.println("Agora informe os dias: ");
		dias = leia.nextInt();
		
		dias = ((2022- anos) * 365) + ((12-meses-11)* 30) + ((-1)* (dias-26)) ;
		System.out.println("\nA sua idade em dias é " + dias);
		
		leia.close();
		
		
	}

}

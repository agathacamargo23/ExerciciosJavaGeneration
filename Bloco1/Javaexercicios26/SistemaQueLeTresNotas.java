package br.com.aulajava.pratica;

import java.util.Scanner;

public class SistemaQueLeTresNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, media;
		
		System.out.println("Insira a primeira nota: ");
		num1 = leia.nextInt();
				
		System.out.println("Insira a segunda nota: ");
		num2 = leia.nextInt();
		
		System.out.println("Insira a terceira nota: ");
		num3 = leia.nextInt();
		
		media = (num1*2 + num2*3 + num3*5) / (2+3+5);
		
		System.out.println("O valor da media final é " + media);
	}
	

}

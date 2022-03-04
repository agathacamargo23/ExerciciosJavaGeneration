package br.com.generation.vetores.matrizes;

import java.util.Scanner;

public class Exe01De5valores {

	public static void main(String[] args) {
		/* 1-Faça um programa que crie um vetor por leitura com 5
		 *  valores de pontuação de uma atividade e o escreva em seguida.
		 *  Encontre após a maior pontuação e a apresente. 
*/
	
       Scanner entrada = new Scanner(System.in);
		
		double[] pontos = new double[5] ;  
		double maior = 0.0;
		
		
			// inicio ; fim;  passa para proxima(faz o teste)
		for(int i = 0; i <= 4; i ++ ) {
			System.out.println((i + 1) + "º-Insira a sua pontuação: ");
		  pontos[i] = entrada.nextDouble();  
		  // pontos foram digitado e armazenados, a variavel maior la em cima esta declarada como = 0, 
		 // atribuo o valor digitado de pontos a variavel maior e sera substituida o valor.
		  if(pontos [i]>maior) {
			  maior = pontos[i];
		  }
		  else {
		  }
		  System.out.println();
	   }			
		System.out.println("A maior pontuação é: " + maior);
	}
}

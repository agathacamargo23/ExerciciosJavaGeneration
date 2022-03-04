package br.com.generation.exercicios27;

import java.util.Scanner;

public class ProgramaTresInteirosQualMaior {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, maior = 0;
		
		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
			
		 }	
		 else if(num1 < num2 && num2 > num3){ 
			 maior = num2;
			 
		 }
		 else {
		 maior = num3;
		}
		System.out.println("Este e o maior: " + maior);
		}
		
     }




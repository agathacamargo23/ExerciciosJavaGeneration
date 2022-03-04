package br.com.generation.exercicios27;

import java.util.Scanner;

public class LerNumeroTecladoFinalNumerosDigitadosWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numero =  0 , soma =  0 ;

		do {
			soma = soma + numero;
			System.out.println(" Digite um numero: " );
			numero = leia.nextInt();
			if (numero ==  0 ) {
				System.out.println(" Você acertou e soma é: "  + soma);
			}
			else {
				System.out.println(" Você errou!! ");
		}	
		} while (numero != 0 );
		}


	}



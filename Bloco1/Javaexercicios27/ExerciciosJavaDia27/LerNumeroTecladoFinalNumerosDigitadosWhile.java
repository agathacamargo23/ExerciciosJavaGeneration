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
				System.out.println(" Voc� acertou e soma �: "  + soma);
			}
			else {
				System.out.println(" Voc� errou!! ");
		}	
		} while (numero != 0 );
		}


	}



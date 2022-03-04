package br.com.generation.exercicios27;

import java.util.Scanner;

public class Imprima10NumerosParesEImpares {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		int num ;
		int contador1 = 0 , contador2 = 0 ;


		for ( int i =  0 ; i < 10 ; i ++ ) {
			System.out.println(" Digite um numero: ");
			num = leia.nextInt();

			if (num % 2  ==  0 ) {
			contador1 ++ ;
			}
			else {
			contador2 ++ ;

			}


		}
		System.out.println(" Impara: "  + contador2);
		System.out.println(" Pare: "  + contador1);
	}

	}



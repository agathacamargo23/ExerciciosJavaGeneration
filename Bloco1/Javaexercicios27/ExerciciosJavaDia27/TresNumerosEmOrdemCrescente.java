package br.com.generation.exercicios27;

import java.util.Scanner;

public class TresNumerosEmOrdemCrescente {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		int num1,num2,num3, ordem1 = 0, ordem2 = 0, ordem3 = 0;

		System.out.println(" Digite um valor: ");
		num1 = entrada.nextInt();

		System.out.println(" Digite um valor: ");
		num2 = entrada.nextInt();

		System.out.println(" Digite um valor: ");
		num3 = entrada.nextInt();


		if (num1 > num3) {
		num1 = ordem1;
		}
		else  if (num1 < num2) {
		num1 = ordem3;
		}
		else  if (num2 < num3){		
		num3 = ordem2;
		}
		else  if (num2 < num3) {
		num2 = ordem2;
		}
		else  if (num3 < num1){
		num3 = ordem1;
		}
		else   {

		}

		{
			System.out.println("Primeira ordem:" + ordem1);

			System.out.println("Primeira ordem:" + ordem2);

			System.out.println("Primeira ordem:" + ordem3);
}

	}

	}



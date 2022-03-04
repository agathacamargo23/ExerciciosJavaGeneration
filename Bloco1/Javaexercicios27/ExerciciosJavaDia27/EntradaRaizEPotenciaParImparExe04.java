package br.com.generation.exercicios27;

import java.util.Scanner;

public abstract class EntradaRaizEPotenciaParImparExe04 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			int num;
			double raiz, potencia;
			
			System.out.println("Digite um número inteiro: ");
			num = leia.nextInt();
			
			if(num % 2 ==0) {
				System.out.println("Par...........");
				raiz = Math.sqrt(num);  //-->
				System.out.printf("Raiz quadrada: %.2f" , raiz);
			}
			else {
				System.out.println("Impar........");
				potencia = Math.copySign(num, 2);
				System.out.println("Potencia: " +potencia);
			}
			

			
			
			}

		}

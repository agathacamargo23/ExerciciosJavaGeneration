package br.com.generation.vetores.matrizes;

import java.util.Random;

public class Exe02Dados10Valores {
	
	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor 
		 * com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos,
		 *  contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/

		Random sorteio = new Random();

		int[] Valordados = new int[10];
		int maiorNum = 0, media = 0, QuantidadesJogadas = 0;

		System.out.println("\n Os números selecionados foram: ");

		for (int i = 0; i < 10; i++) {
			Valordados[i] = sorteio.nextInt(5) + 1;
			media = media + Valordados[i];
			if (Valordados[i] > maiorNum) {
				maiorNum = Valordados[i];
			}
			System.out.println();
			System.out.println(i + 1 + "O número sorteado foi: " + Valordados[i]);
		}
		for (int i = 0; i < 10; i++) {
			if (Valordados[i] == maiorNum) {
				QuantidadesJogadas++;
			}
		}
			
			System.out.println("A média aritmética é: " + media / 10);
			System.out.println("O maior número foi: " + maiorNum + " e ele foi jogado " + QuantidadesJogadas + " vezes!");
		
	}

}
		




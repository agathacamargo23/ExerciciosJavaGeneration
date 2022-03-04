programa
{
/*Um dado é lançado 10 vezes e o valor correspondente é 
anotado. Faça um programa que gere um vetor com os lançamentos, 
escreva esse vetor. A seguir determine e imprima a média aritmética dos 
lançamentos, contabilize e apresente 
também quantas foram as ocorrências da maior pontuação*/
	
	funcao inicio()
	{

	inteiro dados [10], maior_pont, contador,soma=0
	real media


	 para(contador=0; contador<10; contador++){
	 	escreva("Escreva o ",contador+1, " dado: ")
	 	leia(dados[contador])

		soma= soma + dados[contador]
	 }
	 
		escreva("A média é ", soma/10)
				}
	 }


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
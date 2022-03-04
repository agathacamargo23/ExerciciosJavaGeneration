programa
{
	
	funcao inicio()
	{
		cadeia atividade[5]
		inteiro cont=1, pontos, maior_ponto=0,media

		
		para ( cont=1;    cont<5;   cont++ ) {

			escreva(cont, " Insira seu nome: ")
			leia(atividade[cont])
			escreva("\nPontos: ")
			leia(pontos)

			se(pontos>maior_ponto)
		{
			maior_ponto=pontos
		}
	
		}
		
	     escreva("\nA maior pontuação é: ", maior_ponto)
	
	}
}	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
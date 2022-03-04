programa
{
	//>=51 ele vai pagar multa (M) R$ 4,00 se
     //P é variável para tomates + 50? se
     //E é excesso dos tomates se
     //M é valor da multa se

	funcao inicio()
	{
		real p
	     inteiro m = 4, exc = 50
		escreva("Descreva o quilo dos tomates: \n")
		leia(p)

		    se (p >=51) {
		    	   escreva ("\nVocê Passou do excesso do quilo irá pagar a multa!")
		    	   escreva("\nSeu valor de multa é:", ((p-exc)*m))
		    }senao{
		       escreva("\nVocê não passou do peso de ", exc, " quilos")
		       escreva("\nVocê não deverá pagar a multa")
		       escreva("\nA sua multa será no valor de: ", 4-m, " reais")
		    	
		    }

	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
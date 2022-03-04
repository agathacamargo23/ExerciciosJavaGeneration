programa
{
	
     /*Desenvolver um sistema que efetue a soma 
	de todos os números ímpares que são  múltiplos de três e 
	que se encontram no conjunto dos números de 1 até 500.*/
	
	funcao inicio()
	{
		
	inteiro cont, som_impar3, s_cont
	som_impar3 = 0
	s_cont = 0

	    para (cont = 1; cont <=500; cont++){
	    	

		se (cont % 2 ==1 e cont% 3 == 0){
			s_cont = s_cont +cont
			som_impar3 = som_impar3 + 1
		}
		  senao{}
			
		}

		escreva("\nDessa contagem são impares e multiplos de 3 o total é: ", som_impar3, "Números\n")
	     escreva("\nE a soma desses numeros da o total de: ", s_cont)
	
	}		
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 607; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
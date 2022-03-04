programa
{
	inclua biblioteca Util

	funcao inicio()
	{
		
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		
		inteiro i, j, k

		
		para (i = 0; i < 4; i++) {
			
			para (j = 0; j < 6; j++) {
				N1[i][j] = Util.sorteia(-100, 100) 
				
				N2[i][j] = Util.sorteia(-100, 100) 
				M1[i][j] = N1[i][j] + N2[i][j] 
				M2[i][j] = N1[i][j] - N2[i][j] 
			}
		}

		para (k = 0; k < 2; k++) { 
			escreva("\nValores da matriz M", k+1, "\n")
			para(i = 0; i < 4; i++) { 
				para (j = 0; j < 6; j++) {
					
					se (k == 0) { 
						escreva("[", M1[i][j], "] ")	
					} senao { 
						escreva("[", M2[i][j], "] ")
					}
				}
				escreva("\n")
			}
		}
	}
}






/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 664; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
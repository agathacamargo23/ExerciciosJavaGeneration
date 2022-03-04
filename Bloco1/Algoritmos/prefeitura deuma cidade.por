programa
{
	
	funcao inicio()
	{

	/*
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.*/


    real salario, menor_salario = 0.0, maior_salario=0.0
    inteiro filhos, total_filhos, contador = 1, total_salario=0, media_filhos =0, media =0

     enquanto (contador <=3) {
     	escreva("Digite o salário do habitante número ", contador, " :") 
     	leia(salario)
     	escreva("Insira a qtde de filhos do habitante número ",contador, " :")
     	leia(filhos)
     	limpa()
     	contador = contador + 1
		total_salario = total_salario + salario
		media_filhos = filhos+media/contador

			se (salario>maior_salario){
				maior_salario=salario
			}
			senao{}
			
			se (salario<=100){
				menor_salario=menor_salario+1
			}
			senao{}
			
     	}
     
	 escreva("A média de sálario é: ", total_salario/contador)
      escreva("\nA média de filhos é: ", media_filhos)
      escreva("\nO maior salário é: ", maior_salario)
      escreva("\nO percentual é: ", (menor_salario *100)/contador)
     
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1090; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
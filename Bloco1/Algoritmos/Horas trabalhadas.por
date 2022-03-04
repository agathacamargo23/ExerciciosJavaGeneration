programa
{
	//
Ler variável C e N
	//C = código
	//N = número de horas trab.
	//S = salario
	//H = 10,00
	//E = excesso
	//Excedente = 20,00
	//Salario_total
	//Salario_excedente

	funcao inicio()
	{
		real  numero_horas_trab 
		inteiro codigo, salario_hora = 10, hora_exc = 50, exc = 20, salario_total, salario_excedente

		escreva("Descreva o código do funcionário: ")
		leia(codigo)
		escreva ("Diga a quantidade de horas trabalhadas: ")
		leia(numero_horas_trab)

		se (numero_horas_trab >=51) {
			
		
		    	     escreva ("\nO funcionário ", codigo, " excedeu horas\n")
		    	   	escreva("\nForam excedidos ", (numero_horas_trab-hora_exc), " horas trabalhadas!\n")
		    	   	escreva("\nO pagamento excedido será: ", ((salario_hora*numero_horas_trab)*(exc)), " reais\n")

	        }senao{
				escreva("\nSe o funcionário ", codigo, "não excedeu as horas trabalhadas\n")
	        		escreva("\nSeu salário será de: ", (numero_horas_trab*salario_hora), " reais\n")
	        }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 980; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
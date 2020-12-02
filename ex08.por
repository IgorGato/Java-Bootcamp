programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real custo_fabrica, custo_final
		escreva("Digite o custo de fabrica de um carro\n")
		leia(custo_fabrica)
		custo_final = custo_fabrica+custo_fabrica*0.28+custo_fabrica*0.45

		escreva("O custo final do carro é: ", 
			+Matematica.arredondar(custo_final, 2)+" reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
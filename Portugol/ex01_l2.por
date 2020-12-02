programa
{
	
	funcao inicio()
	{
		real p, eh = 0.0, m = 0.0
		const inteiro MAX = 50
		const real valorMulta = 4.0
		leia(p)
		se (p > MAX){
			eh = p - MAX
			m = eh * valorMulta
		}

		escreva("O valor do peso excedente é de "+eh+" kilos, e da multa de "+m+" reais")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
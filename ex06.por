programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{	real x1, y1, x2, y2, dis_euclides
		escreva("Digite duas coordenadas em um plano:\n")
		leia(x1, y1, x2, y2)
		dis_euclides = Matematica.raiz(
			Matematica.potencia(x2-x1,2.0)+Matematica.potencia(y2-y1,2.0), 2.0)
		dis_euclides = Matematica.arredondar(dis_euclides, 2)
		escreva("A distância euclidiana entre eles é: "+ dis_euclides)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
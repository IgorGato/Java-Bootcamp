programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real a, b, c, d, eh, f, x, y
		escreva("Digite os coeficientes a,b,c,d,e e f para poder calcular o sistema\n")
		leia(a, b, c, d, eh, f)
		x = ((c*eh)-(b*f))/((a*eh)-(b*d))
		y = ((a*f)-(c*d))/((a*eh)-(b*d))

		escreva("Os valores de x e y são respectivamente: ", 
			+Matematica.arredondar(x, 2)+" "+Matematica.arredondar(x, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
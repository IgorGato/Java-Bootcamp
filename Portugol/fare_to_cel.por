programa
{
	inclua biblioteca Matematica 
	funcao inicio()
	{
		
		real fahrenheit
		real celsius
		escreva("Escreva a temperatura em graus fahrenheit\n")
		leia(fahrenheit)
		celsius = (fahrenheit - 32)*5/9
		celsius = Matematica.arredondar(celsius,2)
		escreva("Sua temperatura em celsius eh: ",celsius,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
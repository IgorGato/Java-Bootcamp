programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		escreva("Digite uma variavel N positiva\n")
		inteiro N
		const inteiro MIN = 100
		leia(N)

		se(N < MIN){
			N = 0;
		}
		escreva("O valor da variavel N é: "+N);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
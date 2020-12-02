programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		escreva("Digite um numero inteiro\n")
		inteiro numero
		leia(numero)
		se(numero%2 == 0){
			escreva("Este numero é par\n")
		}senao{
			escreva("Este numero é impar\n")
		}

		se(numero >= 0){
			escreva("Este numero é positivo\n")	
		}senao{
			escreva("Este numero é negativo\n")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
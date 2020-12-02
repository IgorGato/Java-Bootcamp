programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		escreva("Digite valores de base e altura de um triangulo\n")
		inteiro baseTriangulo, alturaTriangulo
		leia(baseTriangulo, alturaTriangulo)

		se(baseTriangulo < 0 ou alturaTriangulo < 0){
			se(baseTriangulo < 0){
				escreva("Digite um valor de base positivo para o triangulo\n")
			}senao{
				escreva("Digite um valor de altura positivo para o triangulo\n")
			}
		}senao{
			escreva("A area do triangulo é: "+((baseTriangulo*alturaTriangulo)/2))
		}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Util
	//adiciona valores aleatorios de um dado a um vetor
	//calcula a media destes pontos, e quantas vezes o maior valor aparece
	
	funcao inicio()
	{
		inteiro pontosDados[10], maiorPonto = 0, numMaiorPonto = 0
		real media = 0.0 
		const inteiro jogadas = 10
		
		para(inteiro i = 0; i < jogadas; i++){
			pontosDados[i] = Util.sorteia(1, 6)
		}
		para(inteiro i = 0; i < jogadas; i++){
			se(pontosDados[i] > maiorPonto){
				maiorPonto = pontosDados[i]
				numMaiorPonto = 0
			}
			
			se(maiorPonto == pontosDados[i]){
				numMaiorPonto++
			}
			media += pontosDados[i]
		}

		media /= jogadas

		para(inteiro i = 0; i < jogadas; i++){
			escreva(pontosDados[i]+" ")
		}
		escreva("\nA media de pontos é: "+media)
		escreva("\nO maior ponto foi "+maiorPonto+" aparecendo "+numMaiorPonto+" vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 839; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
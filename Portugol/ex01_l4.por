programa
{
	
	funcao inicio()
	{
		real attPontuacao[5], nota, maiorNota = 0.0
		
		para(inteiro i = 0; i < 5; i++){
			escreva("Insira a nota "+(i+1)+" do exercicio: ")
			leia(nota)
			attPontuacao[i] = nota
			
			se(nota > maiorNota){
				maiorNota = nota
			}
		}

		para(inteiro i = 0; i < 5; i++){
			escreva("Sua nota "+(i+1)+" do exercicio é: "+attPontuacao[i]+"\n")
		}
		escreva("E sua maior nota foi: "+maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
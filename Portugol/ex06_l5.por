programa
{
	funcao inicio()
	{
		//multiplique um vetor por uma matriz
		
		real vetor[3], matriz[3][3], vetorSoma[3]

		escreva("Preencha o vetor:\n")
		para(inteiro i = 0; i < 3; i++){
			leia(vetor[i])
			vetorSoma[i] = 0.0
		}
		escreva("Agora, preencha a matriz:\n")
		para(inteiro i = 0; i < 3; i++){
			para(inteiro j = 0; j < 3; j++){
				leia(matriz[i][j])
			}
		}
		para(inteiro i = 0; i < 3; i++){
			para(inteiro j = 0; j < 3; j++){
				vetorSoma[i] += vetor[j]*matriz[i][j]
			}
		}

		escreva("A multiplicacao entre a matriz e o vetor resulta em: \n")
		para(inteiro i = 0; i < 3; i++){
			escreva("["+vetorSoma[i]+"]")
		}
			


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
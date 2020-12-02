programa
{
	inclua biblioteca Util

	//escreve os valores salvos na matriz 
	funcao vazio escreverMatriz(inteiro linha, inteiro coluna, inteiro matriz[][]){
			para(inteiro i = 0; i < linha; i++){
			para(inteiro j = 0; j < coluna; j++){
				escreva("["+matriz[i][j]+"]")
			}
			escreva("\n")
		}
	}
	
	funcao inicio()
	{
		const inteiro linha = 4, coluna = 6
		inteiro N1[linha][coluna], N2[linha][coluna]
		inteiro matrizSoma[linha][coluna], matrizSubtracao[linha][coluna]
		

		para(inteiro i = 0; i < linha; i++){
			para(inteiro j = 0; j < coluna; j++){
				escreva("Escreva um valor para ser salvo na posicao ["+i+"]["+j+"] da matriz N1: ")
				//leia(N1[i][j])
				N1[i][j] = Util.sorteia(1, 10)
				escreva("Agora escreva um valor para ser salvo na posicao ["+i+"]["+j+"] da matriz N2: ")
				//leia(N2[i][j])
				N2[i][j] = Util.sorteia(1, 10)
			}
		}

		para(inteiro i = 0; i < linha; i++){
			para(inteiro j = 0; j < coluna; j++){
				matrizSoma[i][j] = N1[i][j]+N2[i][j]
				matrizSubtracao[i][j] = N1[i][j]-N2[i][j]
			}
		}

		escreva("\nValores da matriz de soma:\n")
		escreverMatriz(linha, coluna, matrizSoma)
		
		escreva("\nValores da matriz de subtracao:\n")
		escreverMatriz(linha, coluna, matrizSubtracao)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 647; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
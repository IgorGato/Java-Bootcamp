programa
{
	//soma e imprime os valores salvos na matriz 
	//soma e imprime os valores da diagonal da matriz 
	
	funcao inicio()
	{
		const inteiro linha = 3, coluna = 3
		inteiro matrizSoma[linha][coluna]
		inteiro somaMatriz = 0, somaDiagonal = 0

		para(inteiro i = 0; i < linha; i++){
			para(inteiro j = 0; j < coluna; j++){
				escreva("Escreva um valor para ser salvo na posicao ["+i+"]["+j+"] da matriz: ")
				leia(matrizSoma[i][j])
			}
		}
		

		para(inteiro i = 0; i < linha; i++){
			para(inteiro j = 0; j < coluna; j++){
				somaMatriz += matrizSoma[i][j]
				se(i == j){
					somaDiagonal += matrizSoma[i][j]	
				}
			}
		}

		escreva("Somatorio dos valores da matriz ["+linha+"]["+coluna+"]: "+somaMatriz+"\n")
		escreva("Somatorio dos valores da diagonal da matriz ["+linha+"]["+coluna+"]: "+somaDiagonal+"\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 196; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		/*
		Lê um vetor de 5, depois, um código inteiro. Se o código for zero, finalize o programa; 
		se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
		Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.*/
		
		const inteiro numPosicoes = 5
		real vetorValores[numPosicoes]
		inteiro codigo

		escreva("preencha as "+numPosicoes+" posicoes do vetor real\n")

		para(inteiro i = 0; i < numPosicoes; i++){
			escreva("Insira um numero na posicao "+i+" do vetor: ")
			leia(vetorValores[i])
		}

		escreva("Insira o codigo [0] para finalizar, [1] imprimir os numeros, [2] imprimir os numeros de forma inversa: ")
		leia(codigo)
		se(codigo == 1){
			para(inteiro i = 0; i < numPosicoes; i++){
				escreva("["+vetorValores[i]+"]")
			}
		}senao se (codigo == 2){
			para(inteiro i = numPosicoes-1; i >= 0; i--){
				escreva("["+vetorValores[i]+"]")
			}			
		}senao se(codigo == 0){
			escreva("Programa finalizado")
		}senao{
			escreva("Codigo invalido")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
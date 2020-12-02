programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		escreva("Digite a idade do nadador\n")
		inteiro idadeNadador
		leia(idadeNadador)

		se(idadeNadador < 5){
			escreva("Idade muito nova para ser um nadador\n")
		}senao{
			escreva("A categoria deste nadador é: ")
			
			se(idadeNadador >= 5 e idadeNadador <= 7){
				escreva("Infantial A\n")
			}senao se(idadeNadador >= 8 e idadeNadador <= 11){
				escreva("Infantial B\n")
			}senao se(idadeNadador >= 12 e idadeNadador <= 13){
				escreva("Juvenil A\n")
			}senao se(idadeNadador >= 14 e idadeNadador <= 17){
				escreva("Juvenil B\n")
			}senao{
				escreva("Adultos\n")
			}	
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 657; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
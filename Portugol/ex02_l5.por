programa
{
	
	funcao inicio()
	{
		/*calculo do IMC de um adulto*/
		
		real altura, peso, IMC
		escreva("Digite sua altura: ")
		leia(altura)
		escreva("Digite seu peso: ")
		leia(peso)
		IMC = peso/(altura*2)
		
		escreva("\nDe acordo com seu IMC ")
		
		se(IMC <= 18.5){
			escreva("Voce esta abaixo do peso")
		}senao se (IMC <= 25){
			escreva("Voce esta com peso normal")
		}senao se(IMC <= 30){
			escreva("Voce esta acima do peso")
		}senao{
			escreva("Voce esta obeso")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
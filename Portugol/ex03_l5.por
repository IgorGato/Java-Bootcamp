programa
{
	
	funcao inicio()
	{
		inteiro numero, ate25 = 0, ate50 = 0, ate75 = 0, ate100 = 0
		escreva("Digite numero de 0 a 100 para verificar qual o intervalo em que se encontram\n")
		escreva("Digite um numero negativo para finalizar e saber o resultado\n")
		
		escreva("digite um numero entre 0 e 100: ")
		leia(numero)
		enquanto(numero >= 0){
			se (numero <= 25){
				ate25++
			}senao se(numero <= 50){
				ate50++
			}senao se(numero <= 75){
				ate75++
			}senao se(numero <= 100){
				ate100++
			}senao{
				escreva("numero invalido\n")
			}
			escreva("digite um numero entre 0 e 100: ")
			leia(numero)
		}
			escreva("Ha "+ate25+" numeros entre [0-25], "+ate50+" entre [26-50], "+ate75+" numeros entre [51-75] e "+ate100+" numeros entre [76-100].")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 732; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
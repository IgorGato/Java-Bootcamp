programa
{
	
	funcao inicio()
	{
		inteiro soma = 0
		real media = 0.0, numero = 0.0, numNumeros = 0.0

		escreva("Digite um numero: ")
		
		leia(numero)
		enquanto(numero >= 0){
			soma += numero
			numNumeros++
			
			escreva("Digite outro numero: ")
			leia(numero)
		}
		media = soma/numNumeros
		escreva("Foram digitador "+numNumeros+" valores\n")
		escreva("A soma dos valores  é: "+soma+"\n")
		escreva("A media dos valores  é: "+media+"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
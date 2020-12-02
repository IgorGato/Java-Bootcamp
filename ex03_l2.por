programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		
		real n1, n2, n3, n4, n1_quadrado, n2_quadrado, n3_quadrado, n4_quadrado
		const inteiro MAX = 100
		
		escreva("Digite quatro numeros inteiros:\n")
		leia(n1, n2, n3, n4)

		n1_quadrado = Matematica.potencia(n1, 2.0)
		n2_quadrado = Matematica.potencia(n2, 2.0)
		n3_quadrado = Matematica.potencia(n3, 2.0)
		n4_quadrado = Matematica.potencia(n4, 2.0)
		
		se (n3_quadrado >= MAX){
			escreva("O quadrado de "+n3+" é: "+n3_quadrado)
		}senao{
			escreva("O quadrado de "+n1+" é: "+n1_quadrado)
			escreva("O quadrado de "+n2+" é: "+n2_quadrado)
			escreva("O quadrado de "+n3+" é: "+n3_quadrado)
			escreva("O quadrado de "+n4+" é: "+n4_quadrado)
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
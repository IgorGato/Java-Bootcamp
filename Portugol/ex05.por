programa
{
	
	funcao inicio()
	{	
		/*
		 leia as 3 notas de um aluno e calcule a média final deste
		 Considerar que a média é ponderada e que o peso das notas é: 
		 2,3 e 5, respectivamente.
		 */
		 
		real nota1, nota2, nota3, media 
		escreva("Escreva três notas para se calcular a média\n")
		leia(nota1, nota2, nota3)
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10
		escreva("A média é: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 36; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
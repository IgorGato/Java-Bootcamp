programa
{
	
	funcao inicio()
	{

		/*
		Leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.
		*/
		
		inteiro dias, meses, anos, total_dias
			escreva("Escreva sua idade em anos, meses e dias respectivamente\n")
			escreva("Anos: ")leia(anos)
			escreva("Meses: ")leia(meses)
			escreva("Dias: ")leia(dias)
			total_dias = dias+(meses*30)+(anos*365)
			escreva("Sua idade em dias totais são "+total_dias+" dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 144; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
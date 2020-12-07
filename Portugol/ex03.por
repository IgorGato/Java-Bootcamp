programa
{
	
	funcao inicio()
	{

		/*
		 Leia o tempo de duração de um evento em uma fábrica
		 expressa em segundos e mostre expresso em horas, minutos e segundos.
		 */
		 
		inteiro segundos, minutos, horas
			escreva("Escreva o tempo de duração do evento em segundos: ")
			leia(segundos)
			horas = segundos/3600
			segundos = segundos%3600
			minutos = segundos/60
			segundos = segundos%60
			escreva("O tempo do evento foi de "+horas+" hora(s), "+minutos+" minuto(s), e "+segundos+" segundo(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
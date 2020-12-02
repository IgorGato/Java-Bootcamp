programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		escreva("Digite o nivel de poluição medido\n")
		real indicePoluicao
		leia(indicePoluicao)
		se(indicePoluicao >= 0.5){
			escreva("indústrias dos três grupos estão intimadas a suspenderem suas atividades\n")
		}senao se(indicePoluicao >= 0.4){
			escreva("indústrias dos 1º e 2º grupos intimadas a suspenderem suas atividades\n")
		}senao se(indicePoluicao >= 0.3){
			escreva("indústrias do 1º grupo intimadas a suspenderem suas atividades\n")
		}senao{
			escreva("Niveis de poluição controlados\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 577; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
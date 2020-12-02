programa
{
	
	funcao inicio()
	{
		real c, n, eh, excedente, salario
		const inteiro MAX = 50
		const real valorHora = 10.0, valorHoraExtra = 20.0
		escreva("Digite o codigo e numero de horas trabalhadas respectivamente:\n")
		leia(c, n)
		se (n > MAX){
			salario = valorHora * MAX
			eh = n - MAX
			excedente = eh * valorHoraExtra
		}senao{
			salario = n * valorHora
			excedente = 0.0
		}

		escreva("O salario total sera de "+(salario + excedente)+" reais, com excedente de "+excedente+" reais.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
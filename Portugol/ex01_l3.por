programa
{
	
	funcao inicio()
	{
		const inteiro numPessoas = 2
		real mediaSalario = 0.0, mediaNumFilhos = 0.0, maiorSalario = 0.0
		real percentualSalarioAte100 = 0.0, info
		
		para(inteiro i = 0; i < numPessoas; i++){
			escreva("Por favor, pessoas "+(i+1)+" escreva as informacoes solicitadas\n")
			
			escreva("Qual o seu salario?: ")
			leia(info)
			mediaSalario += info

			se(info > maiorSalario){
				maiorSalario = info
			}
			se(info < 100){
				percentualSalarioAte100++
			}
			
			escreva("Quantos filhos voce tem?: ")
			leia(info)
			mediaNumFilhos += info 
		}

		mediaSalario /= numPessoas
		mediaNumFilhos /= numPessoas
		percentualSalarioAte100 = (percentualSalarioAte100*100)/numPessoas

		escreva("A media salario é: "+mediaSalario+" reais\n")
		escreva("A media do numero de filhos é: "+mediaNumFilhos+" filhos\n")
		escreva("O maior salario é: "+maiorSalario+" reais\n")
		escreva("Percentual de pessoas com salario de ate 100 reais é: "+percentualSalarioAte100+"% \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 765; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
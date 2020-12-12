programa
{
	
	funcao inicio()
	{
		/*
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
		*/
		real valorEtiqueta, valorFinal
		inteiro opcaoPagamento
		escreva("Digite o valor na etiqueta do produto: ")
		leia(valorEtiqueta)
		valorFinal = valorEtiqueta
		escreva("\nAgora escolha em quantas vezes pretende pagar: 1x, 2x ou 3x\n")
		leia(opcaoPagamento)
		se(opcaoPagamento == 1){
			escreva("Escolha o metodo de pagamento, dinheiro [1], cheque[2] ou cartao de credito[3]")
			leia(opcaoPagamento)
			se(opcaoPagamento == 1 ou opcaoPagamento == 2){
				valorFinal = valorEtiqueta - (valorEtiqueta*0.20)
			}senao se(opcaoPagamento == 3){
				valorFinal = valorEtiqueta - (valorEtiqueta*0.15)
			}

			escreva("Preco do produto com desconto sera de "+valorFinal+" reais")
		}senao se (opcaoPagamento == 2){
			escreva("Preco do produto sera de "+valorFinal+" reais sem juros")
		}senao se(opcaoPagamento == 2){
			valorFinal = valorEtiqueta + (valorEtiqueta*0.10)
			escreva("Preco do produto sera de "+valorFinal+" reais devido aos juros")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
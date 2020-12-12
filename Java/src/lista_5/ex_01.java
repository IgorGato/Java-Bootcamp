package lista_5;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		/*
		Código Condição de pagamento 
		1 À vista em dinheiro ou cheque, recebe 20% de desconto 
		2 À vista no cartão de crédito, recebe 15% de desconto 
		3 Em duas vezes, preço normal de etiqueta sem juros 
		4 Em três vezes, preço normal de etiqueta mais juros de 10%
		*/
		
		double valorEtiqueta, valorFinal;
		int opcaoPagamento;
		System.out.println("Digite o valor na etiqueta do produto: ");
		valorEtiqueta = scanf.nextDouble();
		valorFinal = valorEtiqueta;
		System.out.println("\nAgora escolha em quantas vezes pretende pagar: 1x, 2x ou 3x\n");
		opcaoPagamento = scanf.nextInt();
		
		if(opcaoPagamento == 1){
			System.out.println("Escolha o metodo de pagamento, dinheiro [1], cheque[2] ou cartao de credito[3]");
			opcaoPagamento = scanf.nextInt();
			if(opcaoPagamento == 1 || opcaoPagamento == 2){
				valorFinal = valorEtiqueta - (valorEtiqueta*0.20);
			}else if(opcaoPagamento == 3){
				valorFinal = valorEtiqueta - (valorEtiqueta*0.15);
			}

			System.out.println("Preco do produto com desconto sera de "+valorFinal+" reais");
		}else if(opcaoPagamento == 2){
			System.out.println("Preco do produto sera de "+valorFinal+" reais sem juros");
		}else if(opcaoPagamento == 2){
			valorFinal = valorEtiqueta + (valorEtiqueta*0.10);
			System.out.println("Preco do produto sera de "+valorFinal+" reais devido aos juros");
		}
		
		scanf.close();
	}

}

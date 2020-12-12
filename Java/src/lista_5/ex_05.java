package lista_5;

import java.util.Scanner;

public class ex_05 {
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		/*
		Lê um vetor de 5, depois, um código inteiro. Se o código for zero, finalize o programa; 
		se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. 
		Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.*/
		
		int numPosicoes = 5, codigo;
		double vetorValores[] = new double[numPosicoes];

		System.out.println("preencha as "+numPosicoes+" posicoes do vetor real\n");

		for(int i = 0; i < numPosicoes; i++){
			System.out.print("Insira um numero na posicao "+i+" do vetor: ");
			vetorValores[i] = scanf.nextDouble();
		}

		System.out.print("Insira o codigo [0] para finalizar, [1] imprimir os numeros, [2] imprimir os numeros de forma inversa: ");
		codigo = scanf.nextInt();
		if(codigo == 1){
			for(int i = 0; i < numPosicoes; i++)
				System.out.print("["+vetorValores[i]+"]");
		}else if(codigo == 2){
			for(int i = numPosicoes-1; i >= 0; i--)
				System.out.print("["+vetorValores[i]+"]");
		}else if(codigo == 0)
			System.out.println("Programa finalizado");
		else
			System.out.println("Codigo invalido");
		
		scanf.close();
	}
}

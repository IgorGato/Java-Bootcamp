package lista_4;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		//soma e imprime os valores salvos na matriz 
		//soma e imprime os valores da diagonal da matriz
		
		int linha = 3, coluna = 3, somaMatriz = 0, somaDiagonal = 0;
		int matrizSoma[][] = new int[linha][coluna];

		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				System.out.println("Escreva um valor para ser salvo na posicao ["+i+"]["+j+"] da matriz: ");
				matrizSoma[i][j] = scanf.nextInt();
			}
		}
		

		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				somaMatriz += matrizSoma[i][j];
				if(i == j)
					somaDiagonal += matrizSoma[i][j];
			}
		}

		System.out.println("Somatorio dos valores da matriz ["+linha+"]["+coluna+"]: "+somaMatriz);
		System.out.println("Somatorio dos valores da diagonal da matriz ["+linha+"]["+coluna+"]: "+somaDiagonal);
		
		scanf.close();
	}

}

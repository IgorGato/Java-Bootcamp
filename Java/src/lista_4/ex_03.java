package lista_4;

import java.util.Random;
import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		//some e subtraia valores entre duas matrizes, 
		//depois faça uma matriz para cada um dos resultados
		
		Scanner scanf = new Scanner(System.in);
		Random geradorNumeros = new Random();
		
		int linha = 4, coluna = 6;
		int N1[][] = new int[linha][coluna];
		int N2[][] = new int[linha][coluna];
		int matrizSoma[][] = new int[linha][coluna];
		int matrizSubtracao[][] = new int[linha][coluna];
		

		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				System.out.println("Escreva um valor para ser salvo na posicao ["+i+"]["+j+"] da matriz N1: ");
				N1[i][j] = geradorNumeros.nextInt(10)+1;
				System.out.println("Agora escreva um valor para ser salvo na posicao ["+i+"]["+j+"] da matriz N2: ");
				N2[i][j] = geradorNumeros.nextInt(10)+1;
			}
		}

		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				matrizSoma[i][j] = N1[i][j]+N2[i][j];
				matrizSubtracao[i][j] = N1[i][j]-N2[i][j];
			}
		}

		System.out.println("\nValores da matriz de soma:\n");
		escreverMatriz(linha, coluna, matrizSoma);
		
		System.out.println("\nValores da matriz de subtracao:\n");
		escreverMatriz(linha, coluna, matrizSubtracao);
		
		scanf.close();
	}
	
	public static void escreverMatriz(int linha, int coluna, int matriz[][]){
		for(int i = 0; i < linha; i++){
			for(int j = 0; j < coluna; j++){
				System.out.print("["+matriz[i][j]+"]\t");
		}
		System.out.print("\n");
	}
}

}

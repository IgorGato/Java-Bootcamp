package lista_5;

import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//multiplique um vetor por uma matriz
		
		double vetor[] = new double[3];
		double matriz[][] = new double[3][3]; 
		double vetorSoma[] = new double[3];

		System.out.println("Preencha o vetor:");
		for(int i = 0; i < 3; i++){
			vetor[i] = scanf.nextDouble();
			vetorSoma[i] = 0.0;
		}
		System.out.println("Agora, preencha a matriz:\n");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				matriz[i][j] = scanf.nextDouble();
			}
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				vetorSoma[i] += vetor[j]*matriz[i][j];
			}
		}

		System.out.println("A multiplicacao entre a matriz e o vetor resulta em: \n");
		for(int i = 0; i < 3; i++)
			System.out.print("["+vetorSoma[i]+"]");
		
		scanf.close();
	}

}

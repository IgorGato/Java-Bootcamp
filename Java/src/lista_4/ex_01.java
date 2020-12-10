package lista_4;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		//crie um vetor com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		//Encontrea maior pontuação e a apresente. 
		
		Scanner scanf = new Scanner(System.in);
		
		double attPontuacao[] = new double[5]; 
		double nota, maiorNota = 0.0;
		
		for(int i = 0; i < 5; i++){
			System.out.println("Insira a nota "+(i+1)+" do exercicio: ");
			nota = scanf.nextDouble();
			attPontuacao[i] = nota;
			
			if(nota > maiorNota)
				maiorNota = nota;
		}

		for(int i = 0; i < 5; i++)
			System.out.println("Sua nota "+(i+1)+" do exercicio é: "+attPontuacao[i]+"\n");
		
		System.out.println("E sua maior nota foi: "+maiorNota);
		
		scanf.close();

	}

}

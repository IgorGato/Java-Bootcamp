package lista_4;

import java.util.Scanner;
import java.util.Random;

public class ex_02 {

	public static void main(String[] args) {
		//adiciona valores aleatorios de um dado a um vetor
		//calcula a media destes pontos, e quantas vezes o maior valor aparece
		
		Scanner scanf = new Scanner(System.in);
		Random geradorJogadas = new Random();
		
		int pontosDados[] = new int[10];
		int maiorPonto = 0, numMaiorPonto = 0, numJogadas = 10;
		double media = 0;
		
		for(int i = 0; i < numJogadas; i++){
			pontosDados[i] = geradorJogadas.nextInt(6) + 1;
		}
		for(int i = 0; i < numJogadas; i++){
			if(pontosDados[i] > maiorPonto){
				maiorPonto = pontosDados[i];
				numMaiorPonto = 0;
			}
			
			if(maiorPonto == pontosDados[i])
				numMaiorPonto++;
				
			media += pontosDados[i];
		}

		media /= numJogadas;

		for(int i = 0; i < numJogadas; i++)
			System.out.print(pontosDados[i]+" ");
		
		System.out.print("\nA media de pontos é: "+media);
		System.out.print("\nO maior ponto foi "+maiorPonto+" aparecendo "+numMaiorPonto+" vezes");
		
		scanf.close();
	}

}

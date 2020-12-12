package lista_5;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		double soma = 0.0, j = 1.0;

		for(int i = 1; i <= 50; i++){
			soma += j/i;
			j += 2.0;
		}
		
		System.out.printf("O resultado da soma sera %.2f", soma);
		
		scanf.close();
	}

}

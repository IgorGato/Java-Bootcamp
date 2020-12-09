package lista_3;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner (System.in);
		
		int soma = 0;
		for(int i = 1; i <= 500; i ++){
			if(i%3==0)
				soma += i; 
				
		};

		System.out.println("A soma dos numeros entre 1 e 500 multiplo de três é: "+soma);
		
		scanf.close();
	}

}

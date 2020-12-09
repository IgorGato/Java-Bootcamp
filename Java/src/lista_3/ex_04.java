package lista_3;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner (System.in);
		
		int numero = 0;

		System.out.print("Digite um numero: ");
		numero = scanf.nextInt();
		System.out.print(numero);
		while(numero < 100){
			numero *= 3;
			System.out.print(" ");
			System.out.print(numero);
			
		}
		
		scanf.close();
	}

}

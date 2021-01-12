package lista_2;

import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro\n");
		int numero;
		numero = scanf.nextInt();
		
		if(numero%2 == 0)
			System.out.println("Este numero é par\n");
		else
			System.out.println("Este numero é impar\n");
		

		if(numero >= 0)
			System.out.println("Este numero é positivo\n");
		else
			System.out.println("Este numero é negativo\n");

		scanf.close();
	}

}

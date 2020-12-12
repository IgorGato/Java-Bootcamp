package lista_5;

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		/*
		lê uma quantidade desconhecida de números e conte quantos deles estão os intervalos: 
		[0-25], [26-50], [51-75] e [76-100]. 
		A entrada de dados deve terminar quando for lido um número negativo.*/
		
		int numero, ate25 = 0, ate50 = 0, ate75 = 0, ate100 = 0;
		System.out.println("Digite numero de 0 a 100 para verificar qual o intervalo em que se encontram");
		System.out.println("Digite um numero negativo para finalizar e saber o resultado\n");
		
		System.out.print("digite um numero entre 0 e 100: ");
		numero = scanf.nextInt();
		
		while(numero >= 0){
			if (numero <= 25)
				ate25++;
			else if(numero <= 50)
				ate50++;
			else if(numero <= 75)
				ate75++;
			else if(numero <= 100)
				ate100++;
			else
				System.out.println("numero invalido\n");
	
			System.out.println("digite um numero entre 0 e 100: ");
			numero = scanf.nextInt();
		}
		System.out.println("Ha "+ate25+" numeros entre [0-25], "+ate50+" entre [26-50], "+ate75+" numeros entre [51-75] e "+ate100+" numeros entre [76-100].");
		
		scanf.close();
	}

}

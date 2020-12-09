package lista_3;

import java.util.Scanner;

public class ex_06 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner (System.in);
		
		int numero, i = 0, somaNumerica = 0;
		System.out.print("Digite um numero inteiro: ");
		numero = scanf.nextInt();
		
		do{
			somaNumerica += i;
			i++;
		}while (i <= numero);

		System.out.printf("A soma de todos os numeros predecessores a %d é: %d\n", numero, somaNumerica);
		
		scanf.close();
	}

}

package lista_3;

import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner (System.in);
		
		int numero = 233;

		do{
			while(numero >= 300 && numero <= 400){
				numero += 5;
				System.out.print(numero+" ");
			}
			numero += 3;
			System.out.print(numero+" ");
			
		}while (numero <= 456);
		
		scanf.close();
	}

}

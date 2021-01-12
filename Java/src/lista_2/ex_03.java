package lista_2;

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		double n1, n2, n3, n4, n1_quadrado, n2_quadrado, n3_quadrado, n4_quadrado;
		int MAX = 100;
		
		System.out.println("Digite quatro numeros inteiros:\n");
		n1 = scanf.nextDouble();
		n2 = scanf.nextDouble();
		n3 = scanf.nextDouble();
		n4 = scanf.nextDouble();

		n1_quadrado = Math.pow(n1, 2);
		n2_quadrado = Math.pow(n2, 2);
		n3_quadrado = Math.pow(n3, 2);
		n4_quadrado = Math.pow(n4, 2);
		
		if (n3_quadrado >= MAX){
			System.out.println("O quadrado de "+n3+" é: "+n3_quadrado);
		}else{
			System.out.println("O quadrado de "+n1+" é: "+n1_quadrado);
			System.out.println("O quadrado de "+n2+" é: "+n2_quadrado);
			System.out.println("O quadrado de "+n3+" é: "+n3_quadrado);
			System.out.println("O quadrado de "+n4+" é: "+n4_quadrado);
		}
		
		scanf.close();

	}

}

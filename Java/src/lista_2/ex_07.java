package lista_2;

import java.util.Scanner;

public class ex_07 {
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Digite valores de base e altura de um triangulo");
		int baseTriangulo, alturaTriangulo;
		baseTriangulo = scanf.nextInt(); 
		alturaTriangulo = scanf.nextInt();

		if(baseTriangulo < 0 || alturaTriangulo < 0){
			if(baseTriangulo < 0){
				System.out.println("Digite um valor de base positivo para o triangulo");
			}else{
				System.out.println("Digite um valor de altura positivo para o triangulo");
			}
		}else{
			System.out.println("A area do triangulo é: "+((baseTriangulo*alturaTriangulo)/2));
		}
		
		scanf.close();
	}
}

package lista_5;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		/*calculo do IMC de um adulto*/
		
		double altura, peso, IMC;
		System.out.print("Digite sua altura: ");
		altura = scanf.nextDouble();
		System.out.print("Digite seu peso: ");
		peso = scanf.nextDouble();
		IMC = peso/(altura*2);
		
		System.out.print("\nDe acordo com seu IMC ");
		
		if(IMC <= 18.5)
			System.out.print("Voce esta abaixo do peso");
		else if(IMC <= 25)
			System.out.print("Voce esta com peso normal");
		else if(IMC <= 30)
			System.out.print("Voce esta acima do peso");
		else
			System.out.print("Voce esta obeso");
		
		
		scanf.close();
	}

}

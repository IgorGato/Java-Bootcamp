package lista_3;

import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner (System.in);
		
		int soma = 0;
		double media = 0.0, numero = 0.0, numNumeros = 0.0;

		System.out.print("Digite um numero: ");
		
		numero = scanf.nextDouble();
		while(numero >= 0){
			soma += numero;
			numNumeros++;
			
			System.out.print("Digite outro numero: ");
			numero = scanf.nextDouble();
		}
		media = soma/numNumeros;
		
		System.out.print("Foram digitados "+numNumeros+" valores\n");
		System.out.print("A soma dos valores  é: "+soma+"\n");
		System.out.print("A media dos valores  é: "+media+"\n");
		
		scanf.close();
	}

}

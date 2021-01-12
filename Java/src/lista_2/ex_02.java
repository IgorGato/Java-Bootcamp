package lista_2;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		double c, n, eh, excedente, salario, valorHora = 10.0, valorHoraExtra = 20.0;
		int MAX = 50;
		
		System.out.println("Digite o codigo e numero de horas trabalhadas respectivamente:\n");
		c = scanf.nextDouble();
		n = scanf.nextDouble();
		
		if (n > MAX){
			salario = valorHora * MAX;
			eh = n - MAX;
			excedente = eh * valorHoraExtra;
		}else{
			salario = n * valorHora;
			excedente = 0.0;
		}

		System.out.println("O salario total sera de "+(salario + excedente)+" reais, com excedente de "+excedente+" reais.");
		
		scanf.close();
	}

}

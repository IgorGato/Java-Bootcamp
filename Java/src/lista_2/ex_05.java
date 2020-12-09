package turma_java;

import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Digite o nivel de poluição medido");
		
		double indicePoluicao;
		indicePoluicao = scanf.nextDouble();
		if(indicePoluicao >= 0.5)
			System.out.println("indústrias dos três grupos estão intimadas a suspenderem suas atividades.");
		else if(indicePoluicao >= 0.4)
			System.out.println("indústrias dos 1º e 2º grupos intimadas a suspenderem suas atividades.");
		else if(indicePoluicao >= 0.3)
			System.out.println("indústrias do 1º grupo intimadas a suspenderem suas atividades.");
		else
			System.out.println("Niveis de poluição controlados.");
		
		
		scanf.close();

	}

}

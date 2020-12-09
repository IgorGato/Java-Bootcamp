package lista_3;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner (System.in);
		
		int numPessoas = 2;
		double mediaSalario = 0.0, mediaNumFilhos = 0.0, maiorSalario = 0.0;
		double percentualSalarioAte100 = 0.0, info;
		
		for(int i = 0; i < numPessoas; i++){
			System.out.println("Por favor, pessoas "+(i+1)+" escreva as informacoes solicitadas");
			
			System.out.print("Qual o seu salario?: ");
			info = scanf.nextDouble();
			mediaSalario += info;

			if(info > maiorSalario){
				maiorSalario = info;
			}
			if(info <= 100){
				percentualSalarioAte100++;
			}
			
			System.out.print("Quantos filhos voce tem?: ");
			info = scanf.nextDouble();
			mediaNumFilhos += info; 
		}

		mediaSalario /= numPessoas;
		mediaNumFilhos /= numPessoas;
		percentualSalarioAte100 = (percentualSalarioAte100*100)/numPessoas;

		System.out.println("A media salario é: "+mediaSalario+" reais\n");
		System.out.println("A media do numero de filhos é: "+mediaNumFilhos+" filhos\n");
		System.out.println("O maior salario é: "+maiorSalario+" reais\n");
		System.out.println("Percentual de pessoas com salario de ate 100 reais é: "+percentualSalarioAte100+"%\n");
		
		scanf.close();

	}

}

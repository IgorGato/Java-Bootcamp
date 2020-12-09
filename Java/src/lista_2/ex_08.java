package turma_java;

import java.util.Scanner;

public class ex_08 {
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Digite uma variavel N positiva\n");
		int N, MIN = 100;
		N = scanf.nextInt();

		if(N < MIN){
			N = 0;
		}
		System.out.println("O valor da variavel N é: "+N);
		
		scanf.close();
	}
}

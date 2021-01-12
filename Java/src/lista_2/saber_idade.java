package lista_2;
import java.util.Scanner;


public class saber_idade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int idade, anoNascimento;
		System.out.println("Digite seu ano de nascimento");
		anoNascimento = leia.nextInt();
		
		idade = saberIdade(anoNascimento);
		
		System.out.printf("Oi, voce tem %d anos e é considerado ", idade);
		
		if(idade < 18)
			System.out.println("infantojuvenil.\n");
		else if(idade <= 60)
			System.out.println("adulto.\n");
		else
			System.out.println("idoso.\n");
		
		leia.close();
	}
	
	public static int saberIdade(int anoNascimento) {
		
		int idade;
		idade = 2020 - anoNascimento;
		
		return idade;
	}
}


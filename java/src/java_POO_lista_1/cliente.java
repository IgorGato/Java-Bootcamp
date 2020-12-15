package java_POO_lista_1;

import java.util.Scanner;

public class cliente {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Cliente_obj cliente1 = new Cliente_obj();
		
		
		System.out.println("Ola qual o nome do cliente?");
		cliente1.nome = scanf.nextLine();
		System.out.println("Qual o seu genero? [M/F/X]");
		cliente1.genero = scanf.next().toUpperCase().charAt(0);
		
		if(cliente1.genero == 'M')
			System.out.printf("Seja bem vindo cliente %s\n", cliente1.nome);
		else if(cliente1.genero == 'F')
			System.out.printf("Seja bem vinda cliente %s\n", cliente1.nome);
		else
			System.out.printf("Seja bem vindx cliente %s\n", cliente1.nome);
		
		scanf.close();
	}

}

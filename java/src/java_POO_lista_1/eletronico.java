package java_POO_lista_1;

import java.util.Scanner;

public class eletronico {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Eletro_obj celular = new Eletro_obj();
		char opcao;
		
		
		do{
		System.out.println("Qual aplicacao voce gostaria de usar?");
		System.out.println("Facebook, Whatsapp ou Candy Crush ou Porcentagem Bateria [F/W/C/B]");
		opcao = scanf.next().toUpperCase().charAt(0);
		if(opcao == 'B')
			celular.porcentagem();
		else 
			celular.aplicativos(opcao);
		
		System.out.println("Deseja continuar? [S/N]");
		opcao = scanf.next().toUpperCase().charAt(0);
		}while(opcao == 'S');
	}

}

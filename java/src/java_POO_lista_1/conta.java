package java_POO_lista_1;

import java.util.Scanner;

public class conta {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		char opcao;
		
		Conta_obj novaConta = new Conta_obj();
		System.out.println("Digite seu nome de usuario");
		novaConta.nome = scanf.nextLine();
		System.out.println("Agora digite seu numero de conta");
		novaConta.numeroConta = scanf.nextInt();
		System.out.println("Por ultimo seu CPF");
		novaConta.cpf = scanf.next();
		
		System.out.printf("Bem-vindo %s\n", novaConta.nome);

				
		do {		
			System.out.println("Digite a operacao que deseja realizar credito, debito ou consultar saldo [C/D/S]");
			opcao = scanf.next().toUpperCase().charAt(0);
			if(opcao == 'C') {
				System.out.println("Digite o valor que deseja adicionar");
				novaConta.saldo = scanf.nextInt();
				novaConta.addSaldo();
			}else if(opcao == 'D') {
				System.out.println("Digite o valor que deseja retirar");
				novaConta.saldo = scanf.nextInt();
				novaConta.retirarSaldo();	
			}else if(opcao == 'S') {
				novaConta.mostrarSaldo();
			}
			System.out.printf("Deseja realizar mais alguma operacao? [S/N]");
			opcao = scanf.next().toUpperCase().charAt(0);
		}while(opcao != 'N');
	}

}

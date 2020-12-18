package banco;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char opcao, saida;
		int numeroConta = 0, numOperacoes = 10, i = 0;
		conta conta_pessoa1 = new conta();
		
		System.out.println("BANCO CENTRAL");
		do{
			System.out.println("[1] - Abertura de conta: ");
			System.out.println("[2] - Acessar a uma conta existente: ");
			System.out.println("[3] - Sair: ");
			opcao = leia.next().charAt(0);
			if (opcao == '1'){
				System.out.println("[1] - Conta Poupança");
				System.out.println("[2] - Conta Corrente");
				System.out.println("[3] - Conta Especial");
				System.out.println("[4] - Conta Empresa");
				System.out.println("[5] - Conta Universitaria");
				System.out.print("Digite o numero de sua opção: ");
				char opconta = leia.next().charAt(0);
				numeroConta++;
				System.out.println("Digite seu nome:");
				leia.nextLine();
				String nome = leia.nextLine();
				System.out.println("Digite o seu CPF:");
				String cpfConta = leia.next();
				switch (opconta){
					case '1':{
						System.out.println("Digite a data de aniversario da conta: ");
						int dataAniversario = leia.nextInt();
						conta_pessoa1 = new Poupanca(numeroConta, nome, cpfConta,dataAniversario);
					}
					break;	
					case '2':{
						conta_pessoa1 = new Corrente(numeroConta, nome, cpfConta);
					}
					case '3':{
						System.out.println("Digite o valor do limite: ");
						double limite = leia.nextDouble();
						conta_pessoa1 = new Especial(numeroConta, nome, cpfConta, limite);
					}
				}
				
				
			}
			else if (opcao == '2'){
				System.out.println("Digite o numero da conta");
				int numConta = leia.nextInt();
				if(numConta == conta_pessoa1.getNumeroConta()) {
					do{
						System.out.println("Qual operacao deseja realizar? Credito ou Debito ou consultar saldo[C/D/S]");
						opcao = leia.next().toUpperCase().charAt(0);
						if(opcao == 'C') {
							System.out.println("Digite o valor da operacao");
							double valor = leia.nextDouble();
							conta_pessoa1.credito(valor);
						}else if(opcao == 'D') {
							System.out.println("Digite o valor da operacao");
							double valor = leia.nextDouble();
							conta_pessoa1.debito(valor);
						}else if(opcao == 'S') {
							System.out.println("Seu saldo atual é "+conta_pessoa1.getSaldo()+" reais");
						}else {
							System.out.println("Opcao invalida");
						}
					
						System.out.println("Continua S/N");
						saida = leia.next().toUpperCase().charAt(0);
						i++;
					}while(saida == 'S' && i < numOperacoes);
					
					
					System.out.println("Digite a data de hoje");
					int data = leia.nextInt();
					((Poupanca) conta_pessoa1).bonusPoupanca(data);
					
				}else {
					System.out.println("Conta inexistente");
				}
			}
			else
			{
				
			}
			System.out.println("Continua S/N");
			saida = leia.next().toUpperCase().charAt(0);
		} while(saida == 'S');

	}

}

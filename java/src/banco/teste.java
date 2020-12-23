package banco;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		char opcao, saida, tipoTransacao, opconta;
		int numeroConta = 0, numOperacoes = 10, i = 0;
		Conta conta_pessoa1 = null;
		double valorTransacao = 0;
		
		System.out.println("BANCO CENTRAL");
		do{
			System.out.println("[1] - Abertura de conta: ");
			System.out.println("[2] - Acessar a uma conta existente: ");
			System.out.println("[3] - Excluir conta: ");
			System.out.println("[4] - Sair: ");
			opcao = leia.next().charAt(0);
			if (opcao == '1'){
				if(conta_pessoa1 != null) {
					System.out.println("VOCE JÁ POSSUI UMA CONTA. DESEJA EXCLUI-LA? SIM[S] NAO[N]");
					opconta = leia.next().toUpperCase().charAt(0);
					if(opconta == 'S'){
						conta_pessoa1 = null;
						System.out.println("CONTA EXCLUIDA COM SUCESSO\n");
					}
				}
				
				if(conta_pessoa1 == null) {
					System.out.println("[1] - Conta Poupança");
					System.out.println("[2] - Conta Corrente");
					System.out.println("[3] - Conta Especial");
					System.out.println("[4] - Conta Empresa");
					System.out.println("[5] - Conta Universitaria");
					System.out.print("Digite o numero de sua opção: ");
					opconta = leia.next().charAt(0);
					numeroConta++;
					System.out.println("Digite seu nome:");
					leia.nextLine();
					String nome = leia.nextLine();
					System.out.println("Digite o seu CPF:");
					String cpfConta = leia.next();
					
					switch (opconta){
						case '1':{
							conta_pessoa1 = novaPoupanca(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;	
						case '2':
						break;
						case '3':
						break;
						case '4':
						break;
						case '5':{
							conta_pessoa1 = novaUniversitaria(numeroConta, nome, cpfConta);
							System.out.printf("Conta aberta com sucesso. Bem-vindo ao G7-Bank.\n");
						}
						break;
						default:
							System.out.println("OPCAO INVALIDA");
					}
				}
			}
			else if (opcao == '2'){
				if(conta_pessoa1 == null)
					System.out.println("VOCE AINDA NAO POSSUI UMA CONTA\n");
				else {
					System.out.println("Digite o numero da conta");
					int numConta = leia.nextInt();
					if(numConta == conta_pessoa1.getNumeroConta()) {
						if(conta_pessoa1.getTipoConta() == 1) {
							do{
								System.out.println("Qual operacao deseja realizar? Credito ou Debito ou consultar saldo[C/D/S]");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								if(tipoTransacao != 'S') {
									System.out.printf("Informe o valor da transação: R$");
									valorTransacao = leia.nextDouble();
								}
								if(tipoTransacao == 'C')
									conta_pessoa1.credito(valorTransacao);
								else if(tipoTransacao == 'D')
									conta_pessoa1.debito(valorTransacao);
								else if(opcao == 'S')
									System.out.println("Seu saldo atual é "+conta_pessoa1.getSaldo()+" reais");
								else
									System.out.println("OPCAO INVALIDA");
							
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);
				
							System.out.println("Digite a data de hoje");
							int data = leia.nextInt();
							((Poupanca) conta_pessoa1).bonusPoupanca(data);
						}else if(conta_pessoa1.getTipoConta() == 5) {
							do{
								System.out.printf("Saldo Atual: R$%.2f\n",conta_pessoa1.getSaldo());
								System.out.println("Qual operacao deseja realizar? Credito ou Debito ou consultar saldo[C/D/S]");
								tipoTransacao = leia.next().toUpperCase().charAt(0);
								if(tipoTransacao != 'S') {
									System.out.printf("Informe o valor da transação: R$");
									valorTransacao = leia.nextDouble();
								}
									
								if (tipoTransacao == 'C')
									((Universitaria) conta_pessoa1).Credito(valorTransacao);
								else if (tipoTransacao == 'D')
									((Universitaria) conta_pessoa1).Debito(valorTransacao);
								else if (tipoTransacao == 'S') {
									System.out.println("\nSaldo atual: " + conta_pessoa1.getSaldo() + 
											"\nValor Limite Disponível: " + ((Universitaria) conta_pessoa1).getLimite()
											+ "\nValor Limite Universitário Disponível: " + ((Universitaria) conta_pessoa1).getLimiteUniversitario());
								}else {
									System.out.println("OPCAO INVALIDA");
								}
								
								System.out.println("Continua S/N");
								saida = leia.next().toUpperCase().charAt(0);
								i++;
							}while(saida == 'S' && i < numOperacoes);
						}
						
					}else
						System.out.println("CONTA INEXISTENTE");
				}
			}else if (opcao == '3'){
				conta_pessoa1 = null;
				System.out.println("CONTA EXCLUIDA COM SUCESSO");
			}else if (opcao == '4'){
				System.out.println("OBRIGADO PELA PREFERENCIA. VOLTE SEMPRE");
			}
				
		} while(opcao != '4');

	}
	
	public static Poupanca novaPoupanca(int numeroConta, String nome, String cpf){
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a data de aniversario da conta: ");
		
		int dataAniversario = leia.nextInt();
		Poupanca contaNova = new Poupanca(numeroConta, nome, cpf, dataAniversario); 
		System.out.printf("\nTITULAR: %s\nCPF: %s\nANIVERSARIO %d\n",contaNova.getNome(), contaNova.getCpf(), contaNova.getDataAniversario());
		return contaNova;
	}
	
	public static Universitaria novaUniversitaria(int numeroConta, String nome, String cpf){

		Universitaria contaNova = new Universitaria(numeroConta, nome, cpf, 1000, 1000); 
		System.out.printf("\nTITULAR: %s\nCPF: %s\nLIMITE: %.2f\nLIMITE UNIVERSITARIO: %.2f\n\n",contaNova.getNome(), contaNova.getCpf(), contaNova.getLimite(), contaNova.getLimiteUniversitario());
		System.out.println(contaNova.getTipoConta());
		return contaNova;
	}

}

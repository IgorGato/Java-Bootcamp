package banco;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorTransacao;
		char tipoTransacao, opcaoContinuar;
		int transacoesRealizadas=0, limiteTransacoes=10;

		
		Universitaria universitaria = new Universitaria(1,"Igor", "0011", 1000,1000);
		

		do
		{	
			System.out.printf("Saldo Atual: R$%.2f\n",universitaria.getSaldo());
			System.out.printf("Qual transação deseja realizar [C]Credito ou D[Débito]: ");
			tipoTransacao = leia.next().toUpperCase().charAt(0);
			System.out.printf("Informe o valor da transação: R$");
			valorTransacao = leia.nextDouble();
			
			if (tipoTransacao == 'C')
			{
				universitaria.Credito(valorTransacao);
			}
			else if (tipoTransacao == 'D')
			{
				universitaria.Debito(valorTransacao);
			}
			System.out.println("\nSaldo atual: " + universitaria.getSaldo() + 
					"\nValor Limite Disponível: " + universitaria.getLimite()
					+ "\nValor Limite Universitário Disponível: " + universitaria.getLimiteUniversitario());
			
			System.out.print("\nDeseja realizar mais transações S/N:");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
			
			if (opcaoContinuar == 'S')
			{
				transacoesRealizadas++;
			}
			
		}while (opcaoContinuar == 'S' && transacoesRealizadas < limiteTransacoes);
		leia.close();

	}

}

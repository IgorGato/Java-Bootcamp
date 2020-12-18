package banco;

public class Especial extends Corrente{

		private double valorLimite;
		


		public Especial(int numeroConta, String nome, String cpf, double valorLimite) {
			super(numeroConta, nome, cpf);
			this.valorLimite = valorLimite;
		}

		public double getValorLimite() {
			return valorLimite;
		}

		public void setValorLimite(double valorLimite) {
			this.valorLimite = valorLimite;
		}
		
		
		@Override
		public boolean testarSaldo(double valor) {
			
			boolean teste;
			if (valor <= super.getSaldo()) 
			{
				teste = true;
			} 
			else if (valor <= (this.valorLimite+super.getSaldo())){
				// 100 saldo 1000 limite  valor pedido: 200 reais
				//1000 + (200)
				double valorCredito=valor - super.getSaldo();
				super.credito(valorCredito);
				this.valorLimite = this.valorLimite - valorCredito;
				teste = true;
			}
			else
			{
				teste = false;
			}
			
			return teste;
		}
}

package lojinha;

public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private String codigoProduto;
	private int quantidadeProduto = 10;
	
	
	public Produto(String nome, String codigo, double preco) {
		super();
		this.nomeProduto = nome;
		this.precoProduto = preco;
		this.codigoProduto = codigo;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public double getPrecoProduto() {
		return precoProduto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	public void addEstoque(int entrada) {
		this.quantidadeProduto += entrada; 
	}
	
	public void retirarEstoque(int saida) {
		if(testarEstoque(saida))
			this.quantidadeProduto -= saida; 
		else
			System.out.println("QUANTIDADE DE PRODTOS SOLICITADOS MAIOR QUE O ESTOQUE");
	}
	
	private boolean testarEstoque(int saida) {
		
		if(saida <= this.quantidadeProduto)
			return true;
		else 
			return false
	}

	
	public void Debito(double valor) {
		//se valor de debito for menor que saldo disponivel
		//retira do saldo disponivel apenas 
		if(valor <= saldoDisponivel) {
			saldoDisponivel -= valor; 
		}
		//se valor de debito for maior que saldo disponivel mas menor que limite
		//retira todo o saldo disponivel da conta e a diferenca entre o valor de debito
		//retir do limite da conta
		else if(valor <= (saldoDisponivel+limite)) {
			valor -= saldoDisponivel;
			saldoDisponivel = 0;
			limite -= valor;
		}
		//se valor de debito for maior que saldo disponivel e limite, retira do 
		//limite universitario. Retira todo saldo disponivel. Retira todo limite disponivel
		//e a diferenca desconta do limite universitario
		else it(valor <= limiteUniversitario+limite+saldo){
			valor -= saldoDisponivel; 
			saldoDisponivel = 0;
			
			valor -= limite;
			limite = 0;
			
			limiteUNiversitario -= valor;
		}
	}

}

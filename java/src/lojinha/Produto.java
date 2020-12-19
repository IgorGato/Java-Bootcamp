package lojinha;

public class Produto {
	private String nomeProduto;
	private double precoProduto;
	private String codigoProduto;
	private int quantidadeProduto = 10;
	
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Produto(String nome, String codigo, double preco) {
		this.nomeProduto = nome;
		this.precoProduto = preco;
		this.codigoProduto = codigo;
	}
	
	public Produto(String nome, String codigo, double preco, int quantidadeProduto) {
		this.nomeProduto = nome;
		this.precoProduto = preco;
		this.codigoProduto = codigo;
		this.quantidadeProduto = quantidadeProduto;
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
			System.out.println("QUANTIDADE DE PRODUTOS SOLICITADOS MAIOR QUE O ESTOQUE");
	}
	
	private boolean testarEstoque(int saida) {
		
		if(saida <= this.quantidadeProduto)
			return true;
		else 
			return false;
	}
	
	public int comprar(int unidades) {
		if((this.quantidadeProduto - unidades) >= 0) {
			this.quantidadeProduto -= unidades;
			System.out.println(getNomeProduto()+" ADICIONADO COM SUCESSO AO SEU CARRINHO DE COMPRAS");
			return unidades;
		}else {
			System.out.println("NAO HÁ NUMERO DE UNIDADES SUFICIENTES DISPONIVEIS NO ESTOQUE");
			return -1;
		}
	}
	
	public double totalValor() {
		return (getQuantidadeProduto()*getPrecoProduto());
	}

}

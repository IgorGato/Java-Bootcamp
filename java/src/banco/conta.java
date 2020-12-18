package banco;

public class conta {
protected int numeroConta;
	protected String nome;
	protected String cpf;
	protected double saldo;
	
	
	public conta(){

	}
	
	public conta(int numeroConta, String nome, String cpf){
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void debito(double valorDebito) 
	{
		if (testarSaldo(valorDebito))  
		{
			this.saldo = this.saldo - valorDebito;
		} 
		else
		{
			System.out.println("SALDO INDISPONIVEL");
		}
		
		
	}
	
	
	
	public void credito (double valorCredito) 
	{
		this.saldo = this.saldo + valorCredito;
	}
	
	public boolean testarSaldo(double valor) 
	{
		
		boolean teste;
		if (valor <= this.saldo) {
			teste = true;
		} else {
			teste = false;
		}
		
		return teste;
	}

}

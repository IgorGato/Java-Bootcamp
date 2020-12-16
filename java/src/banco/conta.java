package banco;

public class conta {
protected int numeroConta;
	protected String nome;
	protected String cpf;
	
	
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

}

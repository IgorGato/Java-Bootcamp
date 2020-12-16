package java_POO_lista_2;

public class Fornecedor extends Pessoa{
	protected double valorCredito;
	protected double valorDivida;
	public double saldo;
	
	
	public Fornecedor(String nome, int idade, double valorCredito, double valorDivida) {
		super(nome, idade);
		
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	
	public void obterSaldo() {
		setSaldo((getValorCredito()-getValorDivida()));
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	
}

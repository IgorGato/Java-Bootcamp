package java_POO_lista_1;

public class Conta_obj {
	public String nome;
	public int numeroConta;
	public String cpf;
	public double saldo = 0;
	public double valor = 0;
	
	public void addSaldo(){
		this.saldo += this.valor;
	}
	
	public void retirarSaldo(){
		this.saldo -= this.valor;
	}
	
	public void mostrarSaldo() {
		System.out.println("Valor do Saldo: "+saldo);
	}
}



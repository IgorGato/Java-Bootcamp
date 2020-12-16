package java_POO_lista_2;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double salarioFinal;
	private double imposto;
	
	public Empregado(int codigoSetor, String nome, char genero) {
		super(nome, genero);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	public void calcularSalario() {
		setSalarioFinal(getSalarioBase() - getSalarioBase()*(getImposto()/100));
	}
	
}

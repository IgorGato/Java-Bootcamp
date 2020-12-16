package banco;

public class Poupanca extends conta {
	
	private int dataAniversario;

	public Poupanca(int numeroConta, String nome, String cpf, int dataAniversario) {
		super(numeroConta, nome, cpf);
		this.dataAniversario = dataAniversario;
	}

	public int getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	
}

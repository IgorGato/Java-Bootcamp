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
	
	public void bonusPoupanca(int dataAtual) {
		
		if (dataAtual == this.dataAniversario) {
			super.credito((super.getSaldo()*0.005));
			System.out.println("Acrescido 0,5% ao seu saldo atual");
		}
	}
	
}

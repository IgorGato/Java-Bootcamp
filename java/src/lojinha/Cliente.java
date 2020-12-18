package lojinha;

public class Cliente extends Pessoa{
	
	private String cpf;
	
	
	public Cliente(String nome, char genero) {
		super(nome, genero);
	}



	public String getCpf() {
		return cpf;
	}

}

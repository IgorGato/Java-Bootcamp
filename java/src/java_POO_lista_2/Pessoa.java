package java_POO_lista_2;

public class Pessoa {
	protected String nome; 
	protected String endereco;
	protected String telefone;
	protected int idade;
	protected char genero;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(String nome, char genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
}

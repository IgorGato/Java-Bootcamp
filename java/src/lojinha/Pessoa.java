package lojinha;

abstract class Pessoa {
	
	private String nome;
	private char genero;
	private int anoNascimento;
	
	
	public Pessoa(String nome, char genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public char getGenero() {
		return genero;
	}


	public void setGenero(char genero) {
		this.genero = genero;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int voltarIdade(int anoAtual) {
		
		if(anoAtual < 1900 || this.anoNascimento < 1900) {
			System.out.println("Dados invalidos");
		}
		
		return (anoAtual - this.anoNascimento);
	}
	
}

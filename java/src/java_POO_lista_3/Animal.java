package java_POO_lista_3;

public class Animal {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String somAnimal() {
		return "O som que o "+this.nome+" emite é: ";
	}
	
	public String andarAnimal() {
		return this.nome+" se locomove: ";
	}
	
}

package java_POO_lista_3;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public String somAnimal() {
		return "O som que o "+super.getNome()+" emite é: Latindo";
	}
	
	public String andarAnimal() {
		return super.getNome()+" se locomove: Correndo";
	}
}

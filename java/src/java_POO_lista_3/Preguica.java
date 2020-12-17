package java_POO_lista_3;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public String somAnimal() {
		return "O som que o "+super.getNome()+" emite é: Nenhum";
	}
	
	public String andarAnimal() {
		return super.getNome()+" se locomove: Escalando";
	}
}

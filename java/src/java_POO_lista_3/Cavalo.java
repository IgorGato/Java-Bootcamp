package java_POO_lista_3;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public String somAnimal() {
		return "O som que o "+super.getNome()+" emite é: Relincho";
	}
	
	public String andarAnimal() {
		return super.getNome()+" se locomove: Trotando";
	}
	
}

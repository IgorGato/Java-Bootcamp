package java_POO_lista_3;

public class fazendinha {

	public static void main(String[] args) {
		Cavalo mike = new Cavalo("Mike", 6);
		Cachorro costelinha = new Cachorro("Costelinha", 3);
		Preguica marta = new Preguica("Marta", 5);
		
		System.out.printf("%s possui %d anos de idade \n", mike.getNome(), mike.getIdade());
		System.out.printf("%s\n", mike.somAnimal());
		System.out.printf("%s\n", mike.andarAnimal());
		
		System.out.println();
		System.out.printf("%s possui %d anos de idade \n", costelinha.getNome(), costelinha.getIdade());
		System.out.printf("%s\n", costelinha.somAnimal());
		System.out.printf("%s\n", costelinha.andarAnimal());
		
		System.out.println();
		System.out.printf("%s possui %d anos de idade \n", marta.getNome(), marta.getIdade());
		System.out.printf("%s\n", marta.somAnimal());
		System.out.printf("%s\n", marta.andarAnimal());

	}

}

package java_POO_lista_2;

public class lojaTeste {

	public static void main(String[] args) {
		Fornecedor miguel = new Fornecedor("Miguel dos Santos", 27, 200, 100);
		
		miguel.obterSaldo();
		System.out.println("Nome do fornecedor: "+miguel.getNome()+"; Idade: "+miguel.getIdade());
		System.out.println("Saldo em conta: "+miguel.getSaldo());
		System.out.println();
		
		Empregado joao = new Empregado(001, "Joao Mario", 'M');
		
		joao.setIdade(22);
		joao.setImposto(20);
		joao.setSalarioBase(1000);
		joao.calcularSalario();
		
		
		System.out.printf("%s, possui %d anos.\nRecebe de salario base de %.2f reais "
				+ "mas devido a %.2f%% de impostos ele recebe %.2f\n",joao.getNome(), joao.getIdade(), joao.getSalarioBase(), joao.getImposto(), joao.getSalarioFinal());
		System.out.println();
		
		Administrdor fred = new Administrdor();
		
		fred.setNome("Frederico Gustavo");
		fred.setTelefone("(11) 4002-8922");
		fred.setGastoGasolina(100);
		fred.setGastoViagens(250);
		fred.somarCustosTotais();
		
		System.out.println("nome: "+fred.getNome());
		System.out.println("telefone: "+fred.getTelefone());
		System.out.println("gastos com gasolina: "+fred.getGastoGasolina());
		System.out.println("gatos com viagens: "+fred.getGastoViagens());
		System.out.println("gatos com viagens: "+fred.getAjudaCustosTotal());
	}
}

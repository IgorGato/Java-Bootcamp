package java_POO_lista_2;

public class lojaTeste {

	public static void main(String[] args) {
		Fornecedor miguel = new Fornecedor("Miguel dos Santos", 27, 200, 100);
		
			miguel.obterSaldo();
			System.out.println("Nome do fornecedor: "+miguel.getNome()+"; Idade: "+miguel.getIdade());
			System.out.println("Saldo em conta: "+miguel.getSaldo());
		
			
		Empregado joao = new Empregado(001, "Joao Mario", 'M');
		
		joao.setIdade(22);
		joao.setImposto(20);
		joao.setSalarioBase(1000);
		joao.calcularSalario();
		
		
		//System.out.printf("%s, possui %d anos, ganha um salario base de %2.f reais mas devido a %2.%% de impostos ele recebe %2.fSaldo em conta: ",joao.getNome(), joao.getIdade(), joao.getSalarioBase(), joao.getImposto(), joao.getSalarioFinal());
	
	}
}

package lojinha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stargames {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int numProdutos = 10, i, opcao;
		String codigo;
		char saida;
		
		List<Produto> estoque = iniciarEstoque(numProdutos);
		
		
		do {
		System.out.println("DIGITE O QUE DESEJA FAZER\n[1]-ADICIONAR UM PRODUTO À LISTA\n"
				+ "[2]-REMOVER UM PRODUTO DA LISTA\n[3]-ATUALIZAR DADOS DE UM PRODUTO DA LISTA\n"
				+ "[4]-APRESENTAR TODOS OS PRODUTOS DISPONIVEIS");
		opcao = scanf.nextInt();
		switch(opcao){
			case 1:
				System.out.println("DIGITE AS INFORMAÇOES NECESSARIAS");
				System.out.print("NOME DO PRODUTO:");
				String nomeNovoProduto = scanf.nextLine();
				System.out.print("PREÇO DO PRODUTO:");
				double precoNovoProduto = scanf.nextDouble();
				System.out.print("QUANTIDADE DO PRODUTO:");
				int quantidadeNovoProduto = scanf.nextInt();
				System.out.print("CODIGO DO PRODUTO:");
				codigo = scanf.next();
				estoque.add(new Produto(nomeNovoProduto, codigo, precoNovoProduto, quantidadeNovoProduto));
				System.out.println("PRODUTO ADICIONADO COM SUCESSO");
				break;
			case 2:
				System.out.println("DIGITE O CODIGO DO PRODUTO");
				codigo = scanf.next();
				Produto produtoRemover = findProduto(estoque, codigo);
				if(produtoRemover == null)
					System.out.println("PRODUTO NAO ENCONTRADO NO ESTOQUE");
				else {
					System.out.println("Codigo:"+produtoRemover.getCodigoProduto()+ "\t    "
							+ "-Nome: "+produtoRemover.getNomeProduto()+" REMOVIDO COM SUCESSO");
					estoque.remove(produtoRemover);
				}
					
				break;
			case 3:
				System.out.println("DIGITE O CODIGO DO PRODUTO");
				codigo = scanf.next();
				Produto produtoAlterar = findProduto(estoque, codigo);
				System.out.println("Codigo:"+produtoAlterar.getCodigoProduto()+ "\t-Preco: "
								+produtoAlterar.getPrecoProduto()+"\t-Quantidade: "+produtoAlterar.getQuantidadeProduto()+"\t    "
								+ "-Nome: "+produtoAlterar.getNomeProduto());	
				System.out.println("QUAL INFORMACAO DESTE PRODUTO DESEJA ALTERAR?\n[1]-"
									+ "CODIGO\n[2]-QUANTIDADE\n[3]-PREÇO\n[4]-NOME");
				opcao = scanf.nextInt();
				if(opcao == 1) {
					System.out.println("DIGITE O NOVO CODIGO DO PRODUTO");
					codigo = scanf.next();
					produtoAlterar.setCodigoProduto(codigo);
					System.out.println("CODIGO DO PRODUTO ALTERADO COM SUCESSO");
				}if(opcao == 2) {
					System.out.println("DIGITE A NOVA QUANTIDADE");
					int quantidade = scanf.nextInt();
					produtoAlterar.setQuantidadeProduto(quantidade);;
					System.out.println("QUANTIDADE DO PRODUTO ALTERADA COM SUCESSO");
				}if(opcao == 3) {
					System.out.println("DIGITE O NOVO PREÇO");
					double preco = scanf.nextDouble();
					produtoAlterar.setPrecoProduto(preco);;
					System.out.println("PREÇO DO PRODUTO ALTERADO COM SUCESSO");
				}if(opcao == 4) {
					System.out.println("DIGITE O NOVO NOME");
					scanf.nextLine();
					String nome = scanf.nextLine();
					produtoAlterar.setNomeProduto(nome);;
					System.out.println("NOME DO PRODUTO ALTERADO COM SUCESSO");
				}else {
					System.out.println("OPCAO INVALIDA");
				}
				break;
			case 4:
				for(Produto prod : estoque)
					System.out.println("Codigo:"+prod.getCodigoProduto()+ "\t-Preco: "
					+prod.getPrecoProduto()+"\t-Quantidade: "+prod.getQuantidadeProduto()+"\t    "
					+ "-Nome: "+prod.getNomeProduto());				
				break;
			};
			
			System.out.println("DESEJA CONTINUAR? [S/N]");
			saida = scanf.next().toUpperCase().charAt(0);
		}while(saida == 'S');
		
	}
	public static List<Produto> iniciarEstoque(int numProdutos){
		List<Produto> estoque = new ArrayList<>();
		String nomeProduto[] = {"Cyperbunk 2077", "Super Smash Bros Ultimate","HADES", "Untitle Goose Game",
                "Animal Crossing: New Horizons","The Last Of US II", "Terraria",
                "The Witcher 3", "Super Mario Odissey", "DOOM Eternal"};
		int precoProduto[] = {250, 300, 50, 45, 280, 120, 15, 75, 290, 200, 150};
		
		for(int i = 0; i < numProdutos; i++) {
			String codigo = ( i <= 9)?"GS-00"+(i+1):"GS-0"+(i+1);
			estoque.add(new Produto(nomeProduto[i], codigo, precoProduto[i]));
		}
		
		return estoque;
	}
	
	public static Produto findProduto(List<Produto> estoque, String codigo) {
		for(Produto prod : estoque) {
			if(prod.getCodigoProduto().equals(codigo)) {
				return prod;
			}
		}
		
		return null;
	}

}

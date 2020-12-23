package lojinha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stargames {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int numProdutos = 10, opcao, numUnidades;
		String codigo;
		char saida;
		
		List<Produto> estoque = iniciarEstoque(numProdutos);
		List<Produto> carrinho = new ArrayList<>();
		
		fazerLinhas(80);
		System.out.println("BEM VINDO À STARGAMES");
		fazerLinhas(80);
		
		System.out.print("DIGITE SEU NOME, CLIENTE:");
		String nome = scanf.nextLine();
		System.out.print("QUAL GENERO VOCE SE IDENTIFICA?\n[M]-MASCULINO\n[F]-FEMININO\n[O]-OUTRO:");
		char genero = scanf.next().toUpperCase().charAt(0);
		Cliente novoCliente = new Cliente(nome, genero);
		if(novoCliente.getGenero() == 'M') {
			System.out.println("SEJA BEM VINDO "+novoCliente.getNome());
		}else if(novoCliente.getGenero() == 'F'){
			System.out.println("SEJA BEM VINDA "+novoCliente.getNome());
		}else {
			System.out.println("SEJA BEM VINDX "+novoCliente.getNome());
		}
		
		do {
		System.out.println("\n[1]-COMPRAR\n[2]-VERIFICAR ESTOQUE\n[3]-SAIR");
		opcao = scanf.nextInt();
			switch(opcao) {
				case 1:
					do {
						System.out.println("DIGITE O QUE DESEJA FAZER COM SEU CARRINHO DE COMPRAS\n"
								+ "[1]-ADICIONAR PRODUTO\n[2]-VERIFICAR PRODUTOS NO CARRINHO\n[3]-FINALIZAR COMPRAS");
						opcao = scanf.nextInt();
						switch(opcao) {
							case 1:
								System.out.println("DIGITE O CODIGO DO PRODUTO QUE DESEJA COMPRAR");
								codigo = scanf.next();
								Produto produtoComprar = findProduto(estoque, codigo);
								do{
									System.out.printf("QUANTAS UNIDADES DE %s DESEJA ADQUIRIR?\n", produtoComprar.getNomeProduto());
									numUnidades = scanf.nextInt();
									numUnidades = produtoComprar.comprar(numUnidades);
								}while(numUnidades == -1);
								
								carrinho.add(new Produto(produtoComprar.getNomeProduto(), produtoComprar.getCodigoProduto(), produtoComprar.getPrecoProduto(), numUnidades));
							break;
								
							case 2:
								showList(carrinho);
							break;
							case 3:
								double somatorioTotal = 0;
								for(Produto prod : carrinho) {
									System.out.println("Codigo:"+prod.getCodigoProduto()+ "\t-Preco: "
											+prod.getPrecoProduto()+"\t-Quantidade: "+prod.getQuantidadeProduto()+"\t    "
											+ "-Nome: "+prod.getNomeProduto()+"\t TOTAL: "+prod.totalValor());
											somatorioTotal += prod.totalValor();
								}
								System.out.printf("\nIMPOSTOS:  %.2f", (somatorioTotal*0.09));
								System.out.println("\nPREÇO FINAL:  "+somatorioTotal);
								System.out.println("\nCOMO DESEJA REALIZAR O PAGAMENTO?\n[1]A VISTA\n[2]3x SEM JUROS\n");
								opcao = scanf.nextInt();
								if(opcao == 1) {
									System.out.println("\n**PAGAMENTO A VISTA**");
									System.out.println("\nVALOR FINAL COM DESCONTO DE 10%\t "+(somatorioTotal*0.9));
								}else if(opcao == 2) {
									System.out.println("\n**PAGAMENTO EM 3x SEM JUROS**");
									System.out.printf("\nVALOR FINAL\t %.2f\n EM 3 PARCELAS DE %.2f\t", somatorioTotal, (somatorioTotal/3));
								}
								System.out.printf("\nAGRADECEMOS A PREFERENCIA. VOLTE SEMPRE");
								carrinho.clear();
								
							break;
						}
						System.out.println("\nDESEJA CONTINUAR? [S/N]");
						saida = scanf.next().toUpperCase().charAt(0);
					}while(saida == 'S');
				break;
				case 2:
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
									nome = scanf.nextLine();
									produtoAlterar.setNomeProduto(nome);;
									System.out.println("NOME DO PRODUTO ALTERADO COM SUCESSO");
								}else {
									System.out.println("OPCAO INVALIDA");
								}
								break;
							case 4:
								showList(estoque);
								break;
							};
							
						System.out.println("\nDESEJA CONTINUAR? [S/N]");
						saida = scanf.next().toUpperCase().charAt(0);
					}while(saida == 'S');
					
				break;
				case 3:
					System.out.println("\nVOLTE SEMPRE");
				break;
				default:
					System.out.println("\nOPCAO INVALIDA");
			}
		}while(opcao != 3);
		
		scanf.close();
	}
	public static void fazerLinhas(int numLinhas) {
		for(int i = 0; i < numLinhas; i++)
			System.out.print("=");
		System.out.println();
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
	
	public static void showList(List<Produto> estoque) {
		for(Produto prod : estoque)
			System.out.println("Codigo:"+prod.getCodigoProduto()+ "\t-Preco: "
			+prod.getPrecoProduto()+"\t-Quantidade: "+prod.getQuantidadeProduto()+"\t    "
			+ "-Nome: "+prod.getNomeProduto());	
	}

}

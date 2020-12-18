package lojinha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stargames {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String nomeProduto[] = {"Cyperbunk 2077", "Super Smash Bros Ultimate","HADES", "Untitle Goose Game",
				                "Animal Crossing: New Horizons","The Last Of US II", "Terraria",
				                "The Witcher 3", "Super Mario Odissey", "DOOM Eternal"};
		int precoProduto[] = {250, 300, 50, 45, 280, 120, 15, 75, 290, 200, 150};
		int numProdutos = 10;
		
		List<Produto> estoque = new ArrayList<>();
		for(int i = 0; i < numProdutos; i++) {
			String codigo =( i <= 9)?"GS-00"+(i+1):"GS-0"+(i+1);
			estoque.add(new Produto(nomeProduto[i], codigo, precoProduto[i]));
		}
		
		for(Produto prod : estoque)
			System.out.println("Codigo:"+prod.getCodigoProduto()+ "\t-Preco: "+prod.getPrecoProduto()+"\t-Quantidade: "+prod.getQuantidadeProduto()+"\t    -Nome: "+prod.getNomeProduto());

	}

}

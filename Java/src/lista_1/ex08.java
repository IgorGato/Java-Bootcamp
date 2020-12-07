package lista_1;
import java.util.Scanner;
public class ex08 {
	public static void main(String[] args) {
		
		/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%*/

		Scanner leia = new Scanner(System.in);
		
		double custo_fabrica, custo_final;
		System.out.println("Digite o custo de fabrica de um carro:");
		custo_fabrica = leia.nextDouble();
		custo_final = custo_fabrica+custo_fabrica*0.28+custo_fabrica*0.45;

		System.out.printf("O custo final do carro é: %.2f reais", custo_final);
		
		leia.close();
	}
}

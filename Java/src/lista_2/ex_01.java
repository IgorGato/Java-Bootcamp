package lista_2;
import java.util.Scanner;
public class ex_01 {

	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		double p, eh = 0.0, m = 0.0, valorMulta = 4.0;
		int MAX = 50;
	
		System.out.print("Digite o peso, (em kilos) do tomate e calcule se houve multa: ");
		p = scanf.nextDouble();
		if (p > MAX){
			eh = p - MAX;
			m = eh * valorMulta;
		}

		System.out.printf("O valor do peso excedente é de %.2f kilos, e da multa de %.2f reais", eh, m);
		
		scanf.close();
	}

}

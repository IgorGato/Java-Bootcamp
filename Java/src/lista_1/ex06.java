package lista_1;
import java.util.Scanner;
public class ex06 {
	public static void main(String[] args) {
		
		/*
		 Dado dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
		 calcule a distancia euclidiana entre eles. 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double x1, y1, x2, y2, dis_euclides;
		System.out.println("Digite duas coordenadas em um plano:\n");
		x1 = leia.nextDouble();
		y1 = leia.nextDouble();
		x2 = leia.nextDouble();
		y2 = leia.nextDouble();
		dis_euclides = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("A distância euclidiana entre eles é: "+ dis_euclides);
		
		leia.close();
	}
}

package lista_1;
import java.util.Scanner;
public class ex05 {
	public static void main(String[] args) {
		
		/*
		 leia as 3 notas de um aluno e calcule a média final deste
		 Considerar que a média é ponderada e que o peso das notas é: 
		 2,3 e 5, respectivamente.
		 */
		
		Scanner leia = new Scanner (System.in); 
		
		double nota1, nota2, nota3, media;
		System.out.println("Escreva três notas para se calcular a média\n");
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();
				
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.printf("A média é: %.2f", media);
		
		leia.close();
	}
}

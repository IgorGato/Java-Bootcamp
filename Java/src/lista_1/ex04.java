package lista_1;
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		double a, b, c, d;
		System.out.println("Digite três números inteiros\n");
		a = leia.nextFloat();
		b = leia.nextFloat();
		c = leia.nextFloat();
		d = (Math.pow(a+b,2) + Math.pow(b+c,2))/2;
		System.out.printf("O valor de D é: %.2f", d);
		
		leia.close();
	}
}

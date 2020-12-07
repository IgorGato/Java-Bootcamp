package lista_1;
import java.util.Scanner;
public class ex07 {
	public static void main(String[] args) {
		
		//sistema de equações lineares
		
		Scanner leia = new Scanner (System.in);
		
		double a, b, c, d, eh, f, x, y;
		System.out.println("Digite os coeficientes a,b,c,d,e e f para poder calcular o sistema\n");
		a = leia.nextDouble();
		b = leia.nextDouble();
		c = leia.nextDouble();
		d = leia.nextDouble();
		eh = leia.nextDouble();
		f = leia.nextDouble();
		x = ((c*eh)-(b*f))/((a*eh)-(b*d));
		y = ((a*f)-(c*d))/((a*eh)-(b*d));

		System.out.printf("Os valores de x e y são respectivamente: %.2f, %.2f", x, y);
		
		
		leia.close();
	}
}

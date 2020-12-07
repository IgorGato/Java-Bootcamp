package lista_1;
import java.util.Scanner;
public class ex03 {
	public static void main(String[] args) {
		
		/*
		 Leia o tempo de duração de um evento em uma fábrica
		 expressa em segundos e mostre expresso em horas, minutos e segundos.
		 */

		
		Scanner leia = new Scanner (System.in); 
		
		int segundos, minutos, horas;
		System.out.println("Escreva o tempo de duração do evento em segundos: ");
		segundos = leia.nextInt();
		horas = segundos/3600;
		segundos = segundos%3600;
		minutos = segundos/60;
		segundos = segundos%60;
		System.out.println("O tempo do evento foi de "+horas+" hora(s), "+minutos+" minuto(s), e "+segundos+" segundo(s).");
		
		leia.close();
	}
}

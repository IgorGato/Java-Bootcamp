package lista_1;
import java.util.Scanner;
public class ex01 {
	public static void main(String[] args) {
		
		/*
		Leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.
		*/
		
		Scanner leia = new Scanner (System.in);
		
		int dias, meses, anos, total_dias;
		
		System.out.println("Escreva sua idade em anos, meses e dias respectivamente");
		System.out.print("Anos: ");
		anos = leia.nextInt();
		System.out.print("Meses: ");
		meses = leia.nextInt();
		System.out.println("Dias: ");
		dias = leia.nextInt();
		total_dias = dias+(meses*30)+(anos*365);
		System.out.println("Sua idade em dias totais são "+total_dias+" dias.");
		
		leia.close();
	}
}

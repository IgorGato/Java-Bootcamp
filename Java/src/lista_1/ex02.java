package lista_1;
import java.util.Scanner;
public class ex02 {
	public static void main(String[] args) {
		
		/*
		Leia a idade de uma pessoa expressa em dias e mostra
		expressa em anos, meses e dias.
		*/
		
		Scanner leia = new Scanner (System.in);
		int dias, meses, anos;
		System.out.print("Escreva sua idade em dias: ");
		dias = leia.nextInt();
		anos = dias/365;
		dias = dias%365;
		meses = dias/30;
		dias = dias%30;
		System.out.println("Sua idade é "+anos+" ano(s), "+meses+" mes(es), e "+dias+" dia(s).");
	
		leia.close();
	}
}

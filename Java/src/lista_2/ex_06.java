package lista_2;

import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador");
		int idadeNadador;
		idadeNadador = scanf.nextInt();
		
		if(idadeNadador < 5){
			System.out.println("Idade muito nova para ser um nadador: ");
		}else{
			System.out.print("A categoria deste nadador é: ");
			
			if(idadeNadador >= 5 && idadeNadador <= 7){
				System.out.println("Infantial A\n");
			}else if(idadeNadador >= 8 && idadeNadador <= 11){
				System.out.println("Infantial B\n");
			}else if(idadeNadador >= 12 && idadeNadador <= 13){
				System.out.println("Juvenil A\n");
			}else if(idadeNadador >= 14 && idadeNadador <= 17){
				System.out.println("Juvenil B\n");
			}else{
				System.out.println("Adultos\n");
			}	
		}
		
		scanf.close();
	}
}

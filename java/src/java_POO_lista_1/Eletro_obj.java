package java_POO_lista_1;

public class Eletro_obj {
	public int bateria = 100;
	public String aplicativo = "Tela inicial";
	
	
	
	public void descarregar(int porcentagem) {
		this.bateria -= porcentagem;
	}
	
	public void aplicativos(char app) {
		System.out.print("Voce esta usando ");
		if(this.bateria <= 0) {
			System.out.println("Voce esta sem bateria no momento");
		}
		if(app == 'W') {
			System.out.println("Whatsapp");
			descarregar(10);
		}else if(app == 'F') {
			System.out.println("Facebook");
			descarregar(15);	
		}else if(app == 'C') {
			System.out.println("Candy Crush");
			descarregar(20);
		}
	}
	
	public void porcentagem() {
		if(this.bateria < 0)
			this.bateria = 0;
		System.out.printf("voce tem %d %% de bateria\n", this.bateria);
	}
}

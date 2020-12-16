package java_POO_lista_2;

public class Administrdor extends Pessoa{
	protected double gastoViagens;
	protected double gastoGasolina;
	protected double ajudaCustosTotal;
	public double getGastoViagens() {
		return gastoViagens;
	}
	public void setGastoViagens(double gastoViagens) {
		this.gastoViagens = gastoViagens;
	}
	public double getGastoGasolina() {
		return gastoGasolina;
	}
	public void setGastoGasolina(double gastoGasolina) {
		this.gastoGasolina = gastoGasolina;
	}
	public double getAjudaCustosTotal() {
		return ajudaCustosTotal;
	}
	private void setAjudaCustosTotal(double ajudaCustosTotal) {
		this.ajudaCustosTotal = ajudaCustosTotal;
	}
	
	public void somarCustosTotais() {
		setAjudaCustosTotal(getGastoGasolina()+getGastoViagens());
	}
	
	
}

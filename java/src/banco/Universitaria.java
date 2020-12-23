package banco;

public class Universitaria extends Conta
{
	private double valorLimite;
	private double limiteUniversitario;
	private double valorLimiteMax;
	private double limiteUniversitarioMax;
	private double limiteNegativo = 1000;
	


	//CONSTRUTOR
		
	public Universitaria(int numeroConta, String nome, String cpf, double valorLimite, double limiteUniversitario) {
		super(numeroConta, nome, cpf);
		this.valorLimite = valorLimite;
		this.limiteUniversitario = limiteUniversitario;
		this.valorLimiteMax = valorLimite;
		this.limiteUniversitarioMax = limiteUniversitario;
		super.tipoConta = 5;
	}

	//GET AND SET
	public double getLimite() {
		return valorLimite;
	}

	public void setLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	public double getLimiteUniversitario() {
		return limiteUniversitario;
	}

	public void setLimiteUniversitario(double limiteUniversitario) {
		this.limiteUniversitario = limiteUniversitario;
	}
	//METODO
	
	//DÉBITO
	public void Debito(double valor) 
	{

        if(valor <= super.saldo)
        	super.saldo -= valor; 
        else if(valor <= (super.saldo + this.valorLimite)){
            valor -= super.saldo;
            super.saldo = 0;
            this.valorLimite -= valor;
        }else if(valor <= (this.limiteUniversitario + this.valorLimite + super.saldo)){
            valor -= super.saldo; 
            super.saldo = 0;

            valor -= this.valorLimite;
            this.valorLimite = 0;

            this.limiteUniversitario -= valor;
        }else if (valor <= (this.limiteUniversitario + this.valorLimite + super.saldo+limiteNegativo)){
        	valor -= super.saldo; 
            super.saldo = 0;

            valor -= this.valorLimite;
            this.valorLimite = 0;
            
            valor -= this.limiteUniversitario; 
            this.limiteUniversitario = 0;
        	
        	super.saldo -= valor;
			System.out.printf("\nTransação realizada com sucesso. Você está negativado.");
        }else	
			System.out.println("\nTransação Não autorizada. Limite indisponivel.");	
		      
    }
	
	//CRÉDITO
	public void Credito(double valor) {
	      								
        if(super.saldo < 0) {
        	if((super.saldo*-1) < valor) {
        		valor += super.saldo;
            	super.saldo = 0;  
        	}else {
        		super.saldo +=valor;
            	valor = 0;
        	}
        }
        		
        
        if(this.limiteUniversitario < this.limiteUniversitarioMax) {
        	
        	if(valor <= this.limiteUniversitarioMax - this.limiteUniversitario){
        		this.limiteUniversitario += valor;
        		valor = 0;
        	}else{
        		valor -= (this.limiteUniversitarioMax - this.limiteUniversitario);
        		this.limiteUniversitario = this.limiteUniversitarioMax;
        	}
        }
        
        if(this.valorLimite < this.valorLimiteMax){
        	if(valor <= this.valorLimiteMax - this.valorLimite){
        		this.valorLimite += valor;
        		valor = 0;
        	}else{
        		valor -= (this.valorLimiteMax - this.valorLimite);
        		this.valorLimite = this.valorLimiteMax;
        	}
        }
        
        saldo += valor;
          
    }
}
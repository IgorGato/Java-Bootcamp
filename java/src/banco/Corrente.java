package banco;

public class Corrente extends conta {

		protected int numeroTalaoCheque;

		
		public Corrente(int numeroConta, String nome, String cpf) {
			super(numeroConta, nome, cpf);
		}

		public int getNumeroTalaoCheque() {
			return numeroTalaoCheque;
		}

		public void setNumeroTalaoCheque(int numeroTalaoCheque) {
			this.numeroTalaoCheque = numeroTalaoCheque;
		}
		
}

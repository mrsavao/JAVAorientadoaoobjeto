public class conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	void deposito(double valor){
		this.saldo = this.saldo + valor ;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposito(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getsaldo() {
		return this.saldo;
	}
}
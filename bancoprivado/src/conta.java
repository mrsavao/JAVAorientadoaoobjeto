public class conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
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
	
	public int getnumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
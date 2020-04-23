
public abstract class Conta {
	private int numero;
	private int agencia;
	protected double saldo;
	private Cliente titular;
	private static int total=0;
	
	public Conta(){
		
	}
	public Conta(int agencia,int numero) {
		Conta.total++;
		System.out.println("O total de contas é "+ Conta.total);
		this.agencia = agencia;
		this.numero = numero;
//		this.saldo = 100;
		System.out.println("Estou criando uma conta "+ this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if(this.saldo >=valor) {		
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean transfere(double valor,Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);;
			return true;
		}
		return false;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}

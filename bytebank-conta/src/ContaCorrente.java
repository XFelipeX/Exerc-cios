
public class ContaCorrente extends Conta  implements Tributavel{
	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero); //chamando construtor especifico
	}						   //super(); chama o construtor default
	
	@Override //alterando um metodo da classe mae
	public boolean saca(double valor) {
		double valorSacar = valor + 0.2;
		return super.saca(valorSacar);		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.1;
	}
}

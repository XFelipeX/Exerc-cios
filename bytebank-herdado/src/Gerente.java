
public class Gerente extends Funcionario implements Autenticavel{
	private Autentificador autentificador;

	
	public Gerente() {
		this.autentificador = new Autentificador();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autentica(senha);

	}

	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);		
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
}

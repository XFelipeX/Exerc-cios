
public class Administrador extends Funcionario implements Autenticavel{
	private Autentificador autentificador;
	
	public Administrador() {
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


	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}



}


public class Cliente implements Autenticavel {
	private Autentificador autentificador;
	
	public Cliente() {
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

}


public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g2 = new Gerente();
		g2.setNome("Elias");
		g2.setSalario(5000.0);
		String nome = g2.getNome();
		
		Funcionario e = new EditorVideo();
		e.setNome("Larissa");
		e.setSalario(1500.0);
		e.setCpf("33333333-0");
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g2);
		controle.registro(e);
		System.out.println(nome);
		System.out.println(controle.getSoma());
		System.out.println();
		
		System.out.println(controle.getSoma());

		System.out.println(e.getNome());
		System.out.println(controle.getSoma());
	}
}

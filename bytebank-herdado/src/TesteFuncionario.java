
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario nico = new EditorVideo();
		nico.setNome("Nico Delacruz");
		nico.setCpf("00000000-0");
		nico.setSalario(2600.00);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}

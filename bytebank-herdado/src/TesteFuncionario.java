
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Nico");
		funcionario.setCpf("222.333.444-55");
		funcionario.setSalario(2600.0);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
	}

}

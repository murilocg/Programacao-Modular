public class Aplicacao {

	public static void main(String[] args) {
		Pessoa maria = new Pessoa("Maria", "00000000000", 17, "Feminino");
		mostrarPessoa(maria);

		maria.setIdade(18);
		maria.setCpf("12345678910");
		maria.setNome("Maria Casada");
		mostrarPessoa(maria);

		maria.setIdade(0);
		maria.setCpf(null);
		maria.setNome(null);
		maria.setSexo("Mascunino");
		mostrarPessoa(maria);

		mostrarPessoa(new Pessoa());
	}

	private static void mostrarPessoa(Pessoa pessoa) {
		System.out.println("\nNome: " + pessoa.getNome());
		System.out.println("Cpf: " + pessoa.getCpf());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
		if (pessoa.eMaiorDeIdade()) {
			System.out.println("É maior de Idade");
		} else {
			System.out.println("Não é maior de Idade");
		}
	}
}

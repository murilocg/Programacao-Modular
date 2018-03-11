
public class PessoaFisica extends Pessoa {

	private int idade;
	private String sexo;

	public PessoaFisica(String nome, String cadastro, int idade, String sexo) {
		super(nome, cadastro);
		setIdade(idade);
		setSexo(sexo);
	}

	public void setSexo(String sexo) {
		if (sexo == null)
			return;
		if (sexo.equals("Masculino") || sexo.equals("Feminino")) {
			this.sexo = sexo;
		}
	}

	public boolean eMaiorDeIdade() {
		return idade >= 18;
	}

	public void setIdade(int idade) {
		if (idade > 0)
			this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}
}

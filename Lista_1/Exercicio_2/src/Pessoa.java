
public class Pessoa {

	private String nome;
	private String cpf;
	private int idade;
	private String sexo;

	public Pessoa(String nome, String cpf, int idade, String sexo) {
		setNome(nome);
		setCpf(cpf);
		setIdade(idade);
		setSexo(sexo);
	}

	public Pessoa() {
		this.nome = "Ninguem";
		this.cpf = "00000000000";
		this.idade = 0;
		this.sexo = "Indefinido";
	}

	public boolean eMaiorDeIdade() {
		return idade >= 18;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty())
			this.nome = nome;
	}

	public void setCpf(String cpf) {
		if (cpf != null && !cpf.trim().isEmpty() && cpf.length() == 11)
			this.cpf = cpf;
	}

	public void setSexo(String sexo) {
		if (sexo == null)
			return;
		if (sexo.equals("Masculino") || sexo.equals("Feminino")) {
			this.sexo = sexo;
		}
	}

	public void setIdade(int idade) {
		if (idade > 0)
			this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}
}

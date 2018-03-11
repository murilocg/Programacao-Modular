
public class Pessoa {

	private String nome;
	private String cadastro;

	public Pessoa(String nome, String cadastro) {
		setNome(nome);
		setCadastro(cadastro);
	}

	public void setCadastro(String cadastro) {
		if (cadastro != null && !cadastro.trim().isEmpty() && cadastro.length() == 11)
			this.cadastro = cadastro;
	}

	public String getCadastro() {
		return this.cadastro;
	}

	public Pessoa() {
		this.nome = "Sem nome";
		this.cadastro = "00000000000";
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty())
			this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}


public class Pessoa extends Endereco {

	private String nomeCompleto;
	private String cadastro;

	public Pessoa(String nome, String endereco, String telefone, String cep, String cidade, String uf, String cadastro) {
		super(nome, endereco, telefone, cep, cidade, uf);
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
		super();
		this.nomeCompleto = "Sem Nome Completo";
		this.cadastro = "00000000000";
	}

	public void setNomeCompleto(String nome) {
		if (nome != null && !nome.trim().isEmpty())
			this.nomeCompleto = nome;
	}

	public String getNome() {
		return nomeCompleto;
	}
}

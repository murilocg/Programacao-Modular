
public class Endereco {

	private String nome;
	private String endereco;
	private String telefone;
	private String cep;
	private String cidade;
	private String uf;

	public Endereco(String nome, String endereco, String telefone, String cep, String cidade, String uf) {
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setCep(cep);
		setCidade(cidade);
		setUf(uf);
	}

	public Endereco() {
		setNome("Ninguem");
		setEndereco("Sem endereço");
		setTelefone("0000-0000");
		setCep("00000-000");
		setCidade("Sem Cidade");
		setUf("Sem Estado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty())
			this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}

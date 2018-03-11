public class PessoaJuridica extends Pessoa {

	private double patrimonio;
	private String nomeFantasia;

	public PessoaJuridica(String nome, String endereco, String telefone, String cep, String cidade, String uf,
			String cnpj, double patrimonio) {
		super(nome, endereco, telefone, cep, cidade, uf, cnpj);
		this.setPatrimonio(patrimonio);
	}

	public double getPatrimonio() {
		return this.patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}

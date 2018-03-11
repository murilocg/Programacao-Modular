public class PessoaJuridica extends Pessoa {

	private double patrimonio;
	private String nomeFantasia;

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia, double patrimonio) {
		super(razaoSocial, cnpj);
		setPatrimonio(patrimonio);
		setNomeFantasia(nomeFantasia);
	}

	public double getPatrimonio() {
		return this.patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		if (patrimonio > 0)
			this.patrimonio = patrimonio;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		if (nomeFantasia != null && !nomeFantasia.trim().isEmpty())
			this.nomeFantasia = nomeFantasia;
	}
}


public class Cliente {

	private Pessoa pessoa;
	private double limiteDeCredito;

	public Cliente(Pessoa pessoa, double limiteDeCredito) {
		replacePessoa(pessoa);
		setLimiDeCredito(limiteDeCredito);
	}

	public void replacePessoa(Pessoa pessoa) {
		if (pessoa != null)
			this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setLimiDeCredito(double limiteDeCredito) {
		if (limiteDeCredito > 0)
			this.limiteDeCredito = limiteDeCredito;
	}

	public double getLimiteDeCredito() {
		return this.limiteDeCredito;
	}
}

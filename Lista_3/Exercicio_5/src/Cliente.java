
public class Cliente {

	private Pessoa pessoa;
	private double limiteDeCredito;

	public Cliente(Pessoa pessoa, double limiteDeCredito) {
		replacePessoa(pessoa);
		setLimiDeCredito(limiteDeCredito);
	}

	public void replacePessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setLimiDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public double getLimiteDeCredito() {
		return this.limiteDeCredito;
	}
}

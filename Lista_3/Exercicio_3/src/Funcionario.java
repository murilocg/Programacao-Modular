
public class Funcionario extends PessoaFisica {

	private String cargo;
	private double salario;

	public Funcionario(String nome, String cadastro, int idade, String sexo, String cargo, double salario) {
		super(nome, cadastro, idade, sexo);
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if (cargo != null && !cargo.trim().isEmpty())
			this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

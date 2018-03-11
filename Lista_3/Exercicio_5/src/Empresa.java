import java.util.ArrayList;
import java.util.List;

public class Empresa extends Endereco {

	private List<Cliente> clientes;
	private List<Funcionario> funcionarios;

	public Empresa(String nome, String endereco, String telefone, String cep, String cidade, String uf) {
		super(nome, endereco, telefone, cep, cidade, uf);
		this.clientes = new ArrayList<Cliente>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void removeCliente(Cliente cliente) {
		clientes.remove(cliente);
	}

	public void replaceCliente(Cliente oldCliente, Cliente newCliente) {
		int i = clientes.indexOf(oldCliente);
		if (i != -1)
			clientes.set(i, newCliente);
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	public void removeFuncionario(Funcionario funcionario) {
		if (funcionarios.size() == 1)
			return;
		funcionarios.remove(funcionario);
	}

	public void replaceFuncionario(Funcionario oldFuncionario, Funcionario newFuncionario) {
		int i = funcionarios.indexOf(oldFuncionario);
		if (i != -1)
			funcionarios.set(i, newFuncionario);
	}

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
}

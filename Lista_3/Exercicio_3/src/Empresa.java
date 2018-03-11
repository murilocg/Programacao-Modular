import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private List<Cliente> clientes;
	private List<Funcionario> funcionarios;

	public Empresa() {
		this.clientes = new ArrayList<Cliente>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public void addCliente(Cliente cliente) {
		if (cliente != null)
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
		if (funcionario != null)
			funcionarios.add(funcionario);
	}

	public void removeFuncionario(Funcionario funcionario) {
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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpresaTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testInicializarEmpresa() {
		Empresa empresa = new Empresa();
		assertEquals("Empresa não está inicializando com 0 clientes", 0, empresa.getClientes().size());
		assertEquals("Empresa não está inicializando com 0 funcionarios", 0, empresa.getFuncionarios().size());
	}

	@Test(timeout = TIME_OUT)
	public void testAddCliente() {
		Empresa empresa = new Empresa();
		empresa.addCliente(getCliente());
		assertEquals("Cliente nao foi adicionado", 1, empresa.getClientes().size());
	}

	private Cliente getCliente() {
		Pessoa p = new PessoaFisica("Adan", "12345678910", 19, "Masculino");
		return new Cliente(p, 1200);
	}

	@Test(timeout = TIME_OUT)
	public void testAddFuncionario() {
		Empresa empresa = new Empresa();
		empresa.addFuncionario(getFuncionario());
		assertEquals("Funcionario nao foi adicionado", 1, empresa.getFuncionarios().size());
	}

	private Funcionario getFuncionario() {
		return new Funcionario("Adan", "12345678910", 19, "Masculino", "Aux administrativo", 1200);
	}

	@Test(timeout = TIME_OUT)
	public void testRemoverCliente() {
		Empresa empresa = new Empresa();
		Cliente c = getCliente();
		empresa.addCliente(c);
		empresa.removeCliente(c);
		assertEquals("Cliente nao foi removido", 0, empresa.getClientes().size());
	}

	@Test(timeout = TIME_OUT)
	public void testRemoverFuncionario() {
		Empresa empresa = new Empresa();
		Funcionario funcionario = getFuncionario();
		empresa.addFuncionario(funcionario);
		empresa.removeFuncionario(funcionario);
		assertEquals("Funcionario nao foi removido", 0, empresa.getFuncionarios().size());
	}

	@Test(timeout = TIME_OUT)
	public void testReplaceCliente() {
		Cliente oldCliente = getCliente();
		Empresa empresa = new Empresa();
		empresa.addCliente(oldCliente);
		Cliente newCliente = getCliente();
		newCliente.getPessoa().setNome("Adan2");
		empresa.replaceCliente(oldCliente, newCliente);
		assertEquals("Cliente nao foi substituido", "Adan2", empresa.getClientes().get(0).getPessoa().getNome());
	}

	@Test(timeout = TIME_OUT)
	public void testReplaceFuncionario() {
		Funcionario oldFuncionario = getFuncionario();
		Empresa empresa = new Empresa();
		empresa.addFuncionario(oldFuncionario);
		Funcionario newFuncionario = getFuncionario();
		newFuncionario.setNome("Adan2");
		empresa.replaceFuncionario(oldFuncionario, newFuncionario);
		assertEquals("Funcionario nao foi substituido", "Adan2", empresa.getFuncionarios().get(0).getNome());
	}

	@Test(timeout = TIME_OUT)
	public void testAddFuncionarioNulo() {
		Empresa empresa = new Empresa();
		empresa.addFuncionario(null);
		assertEquals("Adicionou um funcionario nulo", 0, empresa.getFuncionarios().size());
	}

	@Test(timeout = TIME_OUT)
	public void testAddClienteNulo() {
		Empresa empresa = new Empresa();
		empresa.addCliente(null);
		assertEquals("Adicionou um cliente nulo", 0, empresa.getClientes().size());
	}
}

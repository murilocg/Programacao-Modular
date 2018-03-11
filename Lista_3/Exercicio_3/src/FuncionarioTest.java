import static org.junit.Assert.*;

import org.junit.Test;

public class FuncionarioTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testInicializarFuncionario() {
		Funcionario p = new Funcionario("Adan", "12345678910", 19, "Masculino", "Aux administrativo", 1200);
		assertEquals("Não setou o valor do atributo cargo ao construir", "Aux administrativo", p.getCargo());
		assertEquals("Não setou o valor do atributo salario ao construir", 1200, p.getSalario(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testSCargoNulo() {
		Funcionario p = new Funcionario("Adan", "12345678910", 19, "Masculino", "Aux administrativo", 1200);
		p.setCargo(null);
		assertEquals("Cargo foi modificado ao setar null", "Aux administrativo", p.getCargo());
		p.setCargo("");
		assertEquals("Cargo foi modificado ao setar vazio", "Aux administrativo", p.getCargo());
	}

	@Test(timeout = TIME_OUT)
	public void testSemSalario() {
		Funcionario p = new Funcionario("Adan", "12345678910", 19, "Masculino", "Aux administrativo", 1200);
		p.setIdade(0);
		assertEquals("Salario não pode ser igual a 0", 1200, p.getSalario(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testSalarioNegativo() {
		Funcionario p = new Funcionario("Adan", "12345678910", 19, "Masculino", "Aux administrativo", 1200);
		p.setIdade(-1200);
		assertEquals("Salario não pode ser negativo", 1200, p.getSalario(), 0);
	}
}

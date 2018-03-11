import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PessoaTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testInicializarPessoa() {
		Pessoa p = new Pessoa("Adan", "12345678910");
		assertEquals("Não setou o valor do atributo nome ao construir", "Adan", p.getNome());
		assertEquals("Não setou o valor do atributo cadastro ao construir", "12345678910", p.getCadastro());
	}

	@Test(timeout = TIME_OUT)
	public void testInicializarPessoaPadrao() {
		Pessoa p = new Pessoa();
		assertEquals("Nome não está com valor padrão", "Sem nome", p.getNome());
		assertEquals("Cpf não está com valor padrão", "00000000000", p.getCadastro());
	}

	@Test(timeout = TIME_OUT)
	public void testNomeNulo() {
		Pessoa p = new Pessoa("Adan", "12345678910");
		p.setNome(null);
		assertEquals("Nome foi modificado ao setar null", "Adan", p.getNome());
		p.setNome(" ");
		assertEquals("Nome foi modificado ao setar espaço em branco", "Adan", p.getNome());
	}

	@Test(timeout = TIME_OUT)
	public void testCadastroNulo() {
		Pessoa p = new Pessoa("Adan", "12345678910");
		p.setCadastro(null);
		assertEquals("Cpf foi modificado ao setar null", "12345678910", p.getCadastro());
		p.setCadastro(" ");
		assertEquals("Cpf foi modificado ao setar espaço em branco", "12345678910", p.getCadastro());

	}
}

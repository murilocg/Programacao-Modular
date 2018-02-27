
import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testEMaiorDeIdade() {
		Pessoa adan = new Pessoa("Adan", "12345678910", 19, "Masculino");
		assertTrue("Não está considerando 19 como maior de idade", adan.eMaiorDeIdade());
		adan.setIdade(18);
		assertTrue("Naõ está considerando 18 como maior de idade", adan.eMaiorDeIdade());
		adan.setIdade(17);
		assertFalse("Está considerando 17 como maior de idade", adan.eMaiorDeIdade());
	}

	@Test(timeout = TIME_OUT)
	public void testNomeNulo() {
		Pessoa p = new Pessoa("Adan", "12345678910", 19, "Masculino");
		p.setNome(null);
		assertEquals("Nome foi modificado ao setar null", "Adan", p.getNome());
		p.setNome(" ");
		assertEquals("Nome foi modificado ao setar espaço em branco", "Adan", p.getNome());
	}

	@Test(timeout = TIME_OUT)
	public void testIdadeMenorQueUm() {
		Pessoa p = new Pessoa("Adan", "12345678910", 19, "Masculino");
		p.setIdade(0);
		assertEquals("Idade foi modificada ao setar 0", 19, p.getIdade());
		p.setIdade(-1);
		assertEquals("Idade foi modificada ao setar número negativo", 19, p.getIdade());
	}

	@Test(timeout = TIME_OUT)
	public void testSexoNulo() {
		Pessoa p = new Pessoa("Adan", "12345678910", 19, "Masculino");
		p.setSexo(null);
		assertEquals("Sexo foi modificado ao setar null", "Masculino", p.getSexo());
		p.setSexo(" ");
		assertEquals("Sexo foi modificado ao setar espaço em branco", "Masculino", p.getSexo());
	}

	@Test(timeout = TIME_OUT)
	public void testCpfNulo() {
		Pessoa p = new Pessoa("Adan", "12345678910", 19, "Masculino");
		p.setCpf(null);
		assertEquals("Cpf foi modificado ao setar null", "12345678910", p.getCpf());
		p.setCpf(" ");
		assertEquals("Cpf foi modificado ao setar espaço em branco", "12345678910", p.getCpf());

	}

	@Test(timeout = TIME_OUT)
	public void testSexoIndefinido() {
		Pessoa p = new Pessoa("Adan", "12345678910", 19, "Masculino");
		p.setSexo("Masminino");
		assertEquals("Sexo foi modificado ao setar sexo inexistente", "Masculino", p.getSexo());
	}

	@Test(timeout = TIME_OUT)
	public void testCpfComTamanhoDiferenteDe11() {
		Pessoa p = new Pessoa("Adan", "12345678910", 19, "Masculino");
		p.setCpf("123456789");
		assertEquals("Cpf foi modificado ao setar cpf com menos de 11 caracteres", "12345678910", p.getCpf());
		p.setCpf("1234567891011");
		assertEquals("Cpf foi modificado ao setar cpf com mais de 11 caracteres", "12345678910", p.getCpf());
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaFisicaTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testInicializarPessoaFisica() {
		PessoaFisica p = new PessoaFisica("Adan", "12345678910", 19, "Masculino");
		assertEquals("Não setou o valor do atributo idade ao construir", 19, p.getIdade());
		assertEquals("Não setou o valor do atributo sexo ao construir", "Masculino", p.getSexo());
	}

	@Test(timeout = TIME_OUT)
	public void testSexoIndefinido() {
		PessoaFisica p = new PessoaFisica("Adan", "12345678910", 19, "Masculino");
		p.setSexo("Masminino");
		assertEquals("Sexo foi modificado ao setar sexo inexistente", "Masculino", p.getSexo());
	}

	@Test(timeout = TIME_OUT)
	public void testEMaiorDeIdade() {
		PessoaFisica p = new PessoaFisica("Adan", "12345678910", 19, "Masculino");
		assertTrue("Não está considerando 19 como maior de idade", p.eMaiorDeIdade());
		p.setIdade(18);
		assertTrue("Naõ está considerando 18 como maior de idade", p.eMaiorDeIdade());
		p.setIdade(17);
		assertFalse("Está considerando 17 como maior de idade", p.eMaiorDeIdade());
	}

	@Test(timeout = TIME_OUT)
	public void testIdadeMenorQueUm() {
		PessoaFisica p = new PessoaFisica("Adan", "12345678910", 19, "Masculino");
		p.setIdade(0);
		assertEquals("Idade foi modificada ao setar 0", 19, p.getIdade());
		p.setIdade(-1);
		assertEquals("Idade foi modificada ao setar número negativo", 19, p.getIdade());
	}
}

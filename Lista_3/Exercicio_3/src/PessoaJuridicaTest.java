import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PessoaJuridicaTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testInicializarPessoa() {
		PessoaJuridica p = new PessoaJuridica("Oliveira e Andrade ltda", "1234578910", "Fixa", 10000);
		assertEquals("Não setou o valor do atributo patrinomio ao construir", 10000, p.getPatrimonio(), 0);
		assertEquals("Não setou o valor do atributo nome fantasia ao construir", "Fixa", p.getNomeFantasia());
	}

	@Test(timeout = TIME_OUT)
	public void testNomeFantasiaNulo() {
		PessoaJuridica p = new PessoaJuridica("Oliveira e Andrade ltda", "1234578910", "Fixa", 10000);
		p.setNomeFantasia(null);
		assertEquals("Nome fantasia foi modificado ao setar null", "Fixa", p.getNomeFantasia());
		p.setNomeFantasia("");
		assertEquals("Nome fantasia foi modificado ao setar vazio", "Fixa", p.getNomeFantasia());
	}

	@Test(timeout = TIME_OUT)
	public void testPatrimonioZero() {
		PessoaJuridica p = new PessoaJuridica("Oliveira e Andrade ltda", "1234578910", "Fixa", 10000);
		p.setPatrimonio(0);
		assertEquals("Patrinomio foi modificado ao setar 0", 10000, p.getPatrimonio(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testPatrimonioNegativo() {
		PessoaJuridica p = new PessoaJuridica("Oliveira e Andrade ltda", "1234578910", "Fixa", 10000);
		p.setPatrimonio(-1000);
		assertEquals("Patrinomio foi modificado ao setar negativo", 10000, p.getPatrimonio(), 0);
	}
}

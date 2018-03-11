import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testClientePessoaFisica() {
		clienteHelper(getPessoaFisica(), 1000);
	}

	@Test(timeout = TIME_OUT)
	public void testClientePessoaJuridica() {
		clienteHelper(getPessoaJuridica(), 5000);
	}

	@Test(timeout = TIME_OUT)
	public void testLimiteDeCreditoInvalid() {
		Cliente c = new Cliente(getPessoaFisica(), 1000);
		c.setLimiDeCredito(0);
		assertEquals("modificou o limite de credito ao seta 0", 1000, c.getLimiteDeCredito(), 0);
		c.setLimiDeCredito(-1200);
		assertEquals("modificou o limite de credito ao seta limite negativo", 1000, c.getLimiteDeCredito(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testReplacePessoaNulo() {
		PessoaFisica p = getPessoaFisica();
		Cliente c = new Cliente(p, 1000);
		c.replacePessoa(null);
		assertEquals("modificou a pessoa ao setar null", p, c.getPessoa());
	}

	@Test(timeout = TIME_OUT)
	public void testReplacePessoaFisicaPorJuridica() {
		PessoaFisica pf = getPessoaFisica();
		Cliente c = new Cliente(pf, 1000);
		PessoaJuridica pj = getPessoaJuridica();
		c.replacePessoa(pj);
		assertEquals("Não modificou de pessoa fisica para juridica", pj, c.getPessoa());
	}

	private void clienteHelper(Pessoa p, double limiteDeCredito) {
		Cliente c = new Cliente(p, limiteDeCredito);
		assertEquals("Não setou a pessoa corretamente", p, c.getPessoa());
		assertEquals("Não setou o limite corretamente", limiteDeCredito, c.getLimiteDeCredito(), 0);
	}

	private PessoaFisica getPessoaFisica() {
		return new PessoaFisica("Adan", "12345678910", 19, "Masculino");
	}

	private PessoaJuridica getPessoaJuridica() {
		return new PessoaJuridica("Oliveira e Andrade ltda", "1234578910", "Fixa", 10000);
	}
}

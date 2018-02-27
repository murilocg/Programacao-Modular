import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testInicializarConta() {
		Conta conta = new Conta("Senhor Ninguem", 123, 13, 123456789);
		assertEquals("Conta está inicializando com saldo diferente de 0", 0, conta.getSaldo(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testDeposito() {
		Conta conta = new Conta("Senhor Ninguem", 123, 13, 123456789);
		conta.deposito(100);
		assertEquals("Saldo incorreto após depositar 100 na conta com 0", 100, conta.getSaldo(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testDepositoNegativo() {
		Conta conta = new Conta("Senhor Ninguem", 123, 13, 123456789);
		conta.deposito(-100);
		assertEquals("Deposito de -100 foi aceito", 0, conta.getSaldo(), 0);
	}

	@Test(timeout = TIME_OUT)
	public void testSaque() {
		saqueHelper("Senhor Ninguem", 123, 13, 12456789, 100, 50, 50);
	}

	@Test(timeout = TIME_OUT)
	public void testSaqueMaiorQueSaldo() {
		saqueHelper("Senhor Ninguem", 123, 13, 12456789, 100, 150, 100);
	}

	@Test(timeout = TIME_OUT)
	public void testSaqueNegativo() {
		saqueHelper("Senhor Ninguem", 123, 13, 12456789, 100, -150, 100);
	}

	private void saqueHelper(String cliente, int agencia, int tipoDeConta, int numeroDaConta, int deposito, int saque,
			int saldoEsp) {
		Conta conta = new Conta(cliente, agencia, tipoDeConta, numeroDaConta);
		conta.deposito(deposito);
		conta.saque(saque);
		assertEquals("Saldo incorreto, saque de " + saque + " em uma conta com saldo " + deposito, saldoEsp,
				conta.getSaldo(), 0);
	}
}

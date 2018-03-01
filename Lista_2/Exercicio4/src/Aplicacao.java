
public class Aplicacao {

	public static void main(String[] args) {

		Conta conta = instanciarConta("Mr.Bucket", 123, 13, 123456789);

		conta.saque(100);
		System.out.println("\nApós tentar sacar 100 de uma conta com saldo 0, Saldo: " + conta.getSaldo());
		conta.deposito(100);
		System.out.println("Após depósito de 100 de uma conta com saldo 0, Saldo: " + conta.getSaldo());
		conta.saque(50);
		System.out.println("Após sque de 50 de uma conta com saldo 100, Saldo: " + conta.getSaldo());
		conta.saque(-50);
		System.out.println("Após sque de -50 de uma conta com saldo 50, Saldo: " + conta.getSaldo());

		conta = instanciarConta("Senhor Ninguem", 012, 14, 12345678);
	}

	private static Conta instanciarConta(String cliente, int agencia, int tipoDeConta, int numeroDaConta) {
		System.out.println("\nCount: " + Conta.getCont());
		Conta conta = new Conta(cliente, agencia, tipoDeConta, numeroDaConta);
		System.out.println("Nova Conta criada de ID: " + conta.getId());
		System.out.println("Count: " + Conta.getCont());
		return conta;
	}
}

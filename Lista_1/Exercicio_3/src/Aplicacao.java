
public class Aplicacao {

	public static void main(String[] args) {

		Conta conta = new Conta("Mr.Bucket", 123, 13, 123456789);
		conta.saque(100);
		System.out.println("Ap�s tentar sacar 100 de uma conta com saldo 0, Saldo: " + conta.getSaldo());
		conta.deposito(100);
		System.out.println("Ap�s dep�sito de 100 de uma conta com saldo 0, Saldo: " + conta.getSaldo());
		conta.saque(50);
		System.out.println("Ap�s sque de 50 de uma conta com saldo 100, Saldo: " + conta.getSaldo());
		conta.saque(-50);
		System.out.println("Ap�s sque de -50 de uma conta com saldo 50, Saldo: " + conta.getSaldo());
	}
}

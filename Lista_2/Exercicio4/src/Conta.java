public class Conta {

	private String cliente;
	private double saldo;
	private int agencia;
	private int tipoDeConta;
	private int numeroDaConta;
	private int id;
	private static int count = 0;

	public Conta(String cliente, int agencia, int tipoDeConta, int numeroDaConta) {
		this.cliente = cliente;
		this.agencia = agencia;
		this.tipoDeConta = tipoDeConta;
		this.numeroDaConta = numeroDaConta;
		this.id = ++count;
	}

	public void saque(double quantia) {
		if (quantia > 0 && quantia <= this.saldo)
			this.saldo -= quantia;
	}

	public void deposito(double quantia) {
		if (quantia > 0)
			this.saldo += quantia;
	}
	
	public static int getCont() {
		return count;
	}
	
	public int getId() {
		return this.id;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getTipoDeConta() {
		return tipoDeConta;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}
}

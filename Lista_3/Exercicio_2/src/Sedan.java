
public class Sedan extends Carro {

	private int comprimento;

	public Sedan(int velocidade, double preco, String cor, int comprimento) {
		super(velocidade, preco, cor);
		this.comprimento = comprimento;
	}

	@Override
	public double getPrecoVenda() {
		if (comprimento > 6)
			return super.getPrecoVenda() * 0.95;
		return super.getPrecoVenda() * 0.9;
	}

}

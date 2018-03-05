
public class Fiat extends Carro {

	private int descontoDeFabrica;

	public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
		super(velocidade, preco, cor);
		this.descontoDeFabrica = descontoDeFabrica;
	}

	@Override
	public double getPrecoVenda() {
		return super.getPrecoVenda() - descontoDeFabrica;
	}
}

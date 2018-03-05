
public class Caminhao extends Carro {

	private int carga;

	public Caminhao(int velocidade, double preco, String cor, int carga) {
		super(velocidade, preco, cor);
		this.carga = carga;
	}

	@Override
	public double getPrecoVenda() {
		double preco = super.getPrecoVenda();
		if (carga > 200)
			return preco * 0.9;
		return preco * 0.8;
	}

	public int getCarga() {
		return this.carga;
	}

}

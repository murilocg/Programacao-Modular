
public class AgenciaDeVeiculos {

	public static void main(String[] args) {
		printCarro(new Carro(100, 30000, "preto"));
		printCarro(new Caminhao(120, 100000, "azul", 150));
		printCarro(new Fiat(200, 90000, "branco", 5000));
		printCarro(new Sedan(250, 110000, "vermelho", 200));
	}

	private static void printCarro(Carro carro) {
		System.out.println("\nVelocidade: " + carro.getVelocidade());
		System.out.println("Preço: " + carro.getPrecoVenda());
		System.out.println("Cor: " + carro.getCor());
	}
}

public class Aplicacao {

	public static void main(String[] args) {

		Data data = new Data();
		System.out.println("Data de Hoje: " + data);
		mostrarInfoData(data);

		data.proximoDia();
		System.out.println("\nPróxima data: " + data);
		mostrarInfoData(data);

		data.adicionaDias(30);
		System.out.println("\n30 dias depois: " + data);
		mostrarInfoData(data);
	}

	private static void mostrarInfoData(Data data) {
		System.out.println("Dia da Semana: " + data.diaDaSemana());
		System.out.println("Dias no Mês: " + data.diasNoMes());
		System.out.println("Data por extenso: " + data.porExtenso() );
		if (data.eAnoBisexto()) {
			System.out.println("É Ano bisexto");
		} else {
			System.out.println("Não é ano bisexto");
		}
	}
}

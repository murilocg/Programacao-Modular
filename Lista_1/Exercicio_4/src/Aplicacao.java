public class Aplicacao {

	public static void main(String[] args) {

		double valorPrimeiraConversao = ConversorDeUnidade.converterPesParaMetros(2);
		double valorSegundaConversao = ConversorDeUnidade.converterMetrosParaPes(valorPrimeiraConversao);
		print(valorPrimeiraConversao, valorSegundaConversao, "p�s", "metros");

		valorPrimeiraConversao = ConversorDeUnidade.converterPesParaPolegadas(2);
		valorSegundaConversao = ConversorDeUnidade.converterPolegadasParaPes(valorPrimeiraConversao);
		print(valorPrimeiraConversao, valorSegundaConversao, "p�s", "polegadas");

		valorPrimeiraConversao = ConversorDeUnidade.converterPesParaCentimentros(2);
		valorSegundaConversao = ConversorDeUnidade.converterCentimetrosParaPes(valorPrimeiraConversao);
		print(valorPrimeiraConversao, valorSegundaConversao, "p�s", "cent�metros");

		valorPrimeiraConversao = ConversorDeUnidade.converterPolegadasParaMetros(2);
		valorSegundaConversao = ConversorDeUnidade.converterMetrosParaPolegadas(valorPrimeiraConversao);
		print(valorPrimeiraConversao, valorSegundaConversao, "polegadas", "metros");

		valorPrimeiraConversao = ConversorDeUnidade.converterPolegadasParaCentimetros(2);
		valorSegundaConversao = ConversorDeUnidade.converterCentimetrosParaPolegadas(valorPrimeiraConversao);
		print(valorPrimeiraConversao, valorSegundaConversao, "polegadas", "cent�metros");

		valorPrimeiraConversao = ConversorDeUnidade.converterMetrosParaCentimetros(2);
		valorSegundaConversao = ConversorDeUnidade.converterCentimentrosParaMetros(valorPrimeiraConversao);
		print(valorPrimeiraConversao, valorSegundaConversao, "metros", "cent�metros");
	}

	private static void print(double valorPrimeiraConversao, double valorSegundaConversao, String unidadeInicial,
			String unidadeFinal) {
		String aux1 = String.format("%.2f", valorPrimeiraConversao);
		String aux2 = String.format("%.2f", valorSegundaConversao);
		System.out.println("\n2 " + unidadeInicial + " para " + unidadeFinal + ": " + aux1);
		System.out.println(aux1 + " " + unidadeFinal + " para " + unidadeInicial + ": " + aux2);
	}
}

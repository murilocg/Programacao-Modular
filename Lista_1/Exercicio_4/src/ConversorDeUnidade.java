public class ConversorDeUnidade {

	private static final float TAXA_CENTIMETROS_METROS = 100F;
	private static final float TAXA_CENTIMETROS_PES = 0.0328084F;
	private static final float TAXA_CENTIMETROS_POLEGADAS = 0.393701F;
	private static final float TAXA_PES_METROS = 0.3048F;
	private static final float TAXA_POLEGADAS_PES = 0.0833F;
	private static final float TAXA_METROS_POLEGADAS = 39.37F;

	public static double converterPesParaMetros(double valor) {
		if (valor <= 0)
			return valor;
		return valor * TAXA_PES_METROS;
	}

	public static double converterPesParaPolegadas(double valor) {
		if (valor <= 0)
			return valor;
		return valor / TAXA_POLEGADAS_PES;
	}

	public static double converterPesParaCentimentros(double valor) {
		if (valor <= 0)
			return valor;
		return valor / TAXA_CENTIMETROS_PES;
	}

	public static double converterPolegadasParaMetros(double valor) {
		if (valor <= 0)
			return valor;
		return valor / TAXA_METROS_POLEGADAS;
	}

	public static double converterPolegadasParaPes(double valor) {
		if (valor <= 0)
			return valor;
		return valor * TAXA_POLEGADAS_PES;
	}

	public static double converterPolegadasParaCentimetros(int valor) {
		if (valor <= 0)
			return valor;
		return valor / TAXA_CENTIMETROS_POLEGADAS;
	}

	public static double converterMetrosParaPes(double valor) {
		if (valor <= 0)
			return valor;
		return valor / TAXA_PES_METROS;
	}

	public static double converterMetrosParaPolegadas(double valor) {
		if (valor <= 0)
			return valor;
		return valor * TAXA_METROS_POLEGADAS;
	}

	public static double converterMetrosParaCentimetros(double valor) {
		if (valor <= 0)
			return valor;
		return valor * TAXA_CENTIMETROS_METROS;
	}

	public static double converterCentimetrosParaPes(double valor) {
		if (valor <= 0)
			return valor;
		return valor * TAXA_CENTIMETROS_PES;
	}

	public static double converterCentimetrosParaPolegadas(double valor) {
		if (valor <= 0)
			return valor;
		return valor * TAXA_CENTIMETROS_POLEGADAS;
	}

	public static double converterCentimentrosParaMetros(double valor) {
		if (valor <= 0)
			return valor;
		return valor / TAXA_CENTIMETROS_METROS;
	}
}

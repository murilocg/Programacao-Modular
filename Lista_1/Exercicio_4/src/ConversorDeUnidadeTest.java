import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeUnidadeTest {

	
	private static final float PRECISAO_DE_CONVERSAO = 0.01F;
	private static final int TIMEOUT = 5000;
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPesValorPositivo(){
		assertEquals("Conversão incorreta ao converter 2 pés em metros", 0.6096, ConversorDeUnidade.converterPesParaMetros(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 pés em polegadas", 24, ConversorDeUnidade.converterPesParaPolegadas(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 pés em centímetros", 60.96, ConversorDeUnidade.converterPesParaCentimentros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPolegadasValorPositivo(){
		assertEquals("Conversão incorreta ao converter 2 polegadas em pés", 0.166667, ConversorDeUnidade.converterPolegadasParaPes(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 polegadas em metros", 0.0508, ConversorDeUnidade.converterPolegadasParaMetros(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 polegadas em centímetros", 5.08, ConversorDeUnidade.converterPolegadasParaCentimetros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoMetrosValorPositivo(){
		assertEquals("Conversão incorreta ao converter 2 metros em pés", 6.56168, ConversorDeUnidade.converterMetrosParaPes(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 metros em polegadas", 78.7402, ConversorDeUnidade.converterMetrosParaPolegadas(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 metros em centímetros", 200, ConversorDeUnidade.converterMetrosParaCentimetros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoCentimetrosValorPositivo(){
		assertEquals("Conversão incorreta ao converter 2 centímetros em pés", 0.0656168, ConversorDeUnidade.converterCentimetrosParaPes(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 centímetros em polegadas", 0.787402, ConversorDeUnidade.converterCentimetrosParaPolegadas(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 2 centímetros em metros", 0.02, ConversorDeUnidade.converterCentimentrosParaMetros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPesValorNegativo(){
		assertEquals("Conversão incorreta ao converter -2 pés em metros", -2, ConversorDeUnidade.converterPesParaMetros(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 pés em polegadas", -2, ConversorDeUnidade.converterPesParaPolegadas(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 pés em centímetros", -2, ConversorDeUnidade.converterPesParaCentimentros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPolegadasValorNegativo(){
		assertEquals("Conversão incorreta ao converter -2 polegadas em pés", -2, ConversorDeUnidade.converterPolegadasParaPes(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 polegadas em metros", -2, ConversorDeUnidade.converterPolegadasParaMetros(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 polegadas em centímetros", -2, ConversorDeUnidade.converterPolegadasParaCentimetros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoMetrosValorNegativo(){
		assertEquals("Conversão incorreta ao converter -2 metros em pés", -2, ConversorDeUnidade.converterMetrosParaPes(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 metros em polegadas", -2, ConversorDeUnidade.converterMetrosParaPolegadas(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 metros em centímetros", -2, ConversorDeUnidade.converterMetrosParaCentimetros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoCentimetrosValorNegativo(){
		assertEquals("Conversão incorreta ao converter -2 centímetros em pés", -2, ConversorDeUnidade.converterCentimetrosParaPes(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 centímetros em polegadas", -2, ConversorDeUnidade.converterCentimetrosParaPolegadas(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter -2 centímetros em metros", -2, ConversorDeUnidade.converterCentimentrosParaMetros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPesValorNulo(){
		assertEquals("Conversão incorreta ao converter 0 pés em metros", 0, ConversorDeUnidade.converterPesParaMetros(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 pés em polegadas", 0, ConversorDeUnidade.converterPesParaPolegadas(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 pés em centímetros", 0, ConversorDeUnidade.converterPesParaCentimentros(0), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPolegadasValorNulo(){
		assertEquals("Conversão incorreta ao converter 0 polegadas em pés", 0, ConversorDeUnidade.converterPolegadasParaPes(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 polegadas em metros", 0, ConversorDeUnidade.converterPolegadasParaMetros(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 polegadas em centímetros", 0, ConversorDeUnidade.converterPolegadasParaCentimetros(0), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoMetrosValorNulo(){
		assertEquals("Conversão incorreta ao converter 0 metros em pés", 0, ConversorDeUnidade.converterMetrosParaPes(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 metros em polegadas", 0, ConversorDeUnidade.converterMetrosParaPolegadas(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 metros em centímetros", 0, ConversorDeUnidade.converterMetrosParaCentimetros(0), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoCentimetrosValorNulo(){
		assertEquals("Conversão incorreta ao converter 0 centímetros em pés", 0, ConversorDeUnidade.converterCentimetrosParaPes(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 centímetros em polegadas", 0, ConversorDeUnidade.converterCentimetrosParaPolegadas(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Conversão incorreta ao converter 0 centímetros em metros", 0, ConversorDeUnidade.converterCentimentrosParaMetros(0), PRECISAO_DE_CONVERSAO);
	}
	
}

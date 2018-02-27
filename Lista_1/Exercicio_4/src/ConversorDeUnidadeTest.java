import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDeUnidadeTest {

	
	private static final float PRECISAO_DE_CONVERSAO = 0.01F;
	private static final int TIMEOUT = 5000;
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPesValorPositivo(){
		assertEquals("Convers�o incorreta ao converter 2 p�s em metros", 0.6096, ConversorDeUnidade.converterPesParaMetros(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 p�s em polegadas", 24, ConversorDeUnidade.converterPesParaPolegadas(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 p�s em cent�metros", 60.96, ConversorDeUnidade.converterPesParaCentimentros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPolegadasValorPositivo(){
		assertEquals("Convers�o incorreta ao converter 2 polegadas em p�s", 0.166667, ConversorDeUnidade.converterPolegadasParaPes(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 polegadas em metros", 0.0508, ConversorDeUnidade.converterPolegadasParaMetros(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 polegadas em cent�metros", 5.08, ConversorDeUnidade.converterPolegadasParaCentimetros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoMetrosValorPositivo(){
		assertEquals("Convers�o incorreta ao converter 2 metros em p�s", 6.56168, ConversorDeUnidade.converterMetrosParaPes(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 metros em polegadas", 78.7402, ConversorDeUnidade.converterMetrosParaPolegadas(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 metros em cent�metros", 200, ConversorDeUnidade.converterMetrosParaCentimetros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoCentimetrosValorPositivo(){
		assertEquals("Convers�o incorreta ao converter 2 cent�metros em p�s", 0.0656168, ConversorDeUnidade.converterCentimetrosParaPes(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 cent�metros em polegadas", 0.787402, ConversorDeUnidade.converterCentimetrosParaPolegadas(2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 2 cent�metros em metros", 0.02, ConversorDeUnidade.converterCentimentrosParaMetros(2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPesValorNegativo(){
		assertEquals("Convers�o incorreta ao converter -2 p�s em metros", -2, ConversorDeUnidade.converterPesParaMetros(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 p�s em polegadas", -2, ConversorDeUnidade.converterPesParaPolegadas(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 p�s em cent�metros", -2, ConversorDeUnidade.converterPesParaCentimentros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPolegadasValorNegativo(){
		assertEquals("Convers�o incorreta ao converter -2 polegadas em p�s", -2, ConversorDeUnidade.converterPolegadasParaPes(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 polegadas em metros", -2, ConversorDeUnidade.converterPolegadasParaMetros(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 polegadas em cent�metros", -2, ConversorDeUnidade.converterPolegadasParaCentimetros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoMetrosValorNegativo(){
		assertEquals("Convers�o incorreta ao converter -2 metros em p�s", -2, ConversorDeUnidade.converterMetrosParaPes(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 metros em polegadas", -2, ConversorDeUnidade.converterMetrosParaPolegadas(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 metros em cent�metros", -2, ConversorDeUnidade.converterMetrosParaCentimetros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoCentimetrosValorNegativo(){
		assertEquals("Convers�o incorreta ao converter -2 cent�metros em p�s", -2, ConversorDeUnidade.converterCentimetrosParaPes(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 cent�metros em polegadas", -2, ConversorDeUnidade.converterCentimetrosParaPolegadas(-2), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter -2 cent�metros em metros", -2, ConversorDeUnidade.converterCentimentrosParaMetros(-2), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPesValorNulo(){
		assertEquals("Convers�o incorreta ao converter 0 p�s em metros", 0, ConversorDeUnidade.converterPesParaMetros(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 p�s em polegadas", 0, ConversorDeUnidade.converterPesParaPolegadas(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 p�s em cent�metros", 0, ConversorDeUnidade.converterPesParaCentimentros(0), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoPolegadasValorNulo(){
		assertEquals("Convers�o incorreta ao converter 0 polegadas em p�s", 0, ConversorDeUnidade.converterPolegadasParaPes(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 polegadas em metros", 0, ConversorDeUnidade.converterPolegadasParaMetros(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 polegadas em cent�metros", 0, ConversorDeUnidade.converterPolegadasParaCentimetros(0), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoMetrosValorNulo(){
		assertEquals("Convers�o incorreta ao converter 0 metros em p�s", 0, ConversorDeUnidade.converterMetrosParaPes(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 metros em polegadas", 0, ConversorDeUnidade.converterMetrosParaPolegadas(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 metros em cent�metros", 0, ConversorDeUnidade.converterMetrosParaCentimetros(0), PRECISAO_DE_CONVERSAO);
	}
	
	@Test(timeout = TIMEOUT)
	public void testConversaoCentimetrosValorNulo(){
		assertEquals("Convers�o incorreta ao converter 0 cent�metros em p�s", 0, ConversorDeUnidade.converterCentimetrosParaPes(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 cent�metros em polegadas", 0, ConversorDeUnidade.converterCentimetrosParaPolegadas(0), PRECISAO_DE_CONVERSAO);
		assertEquals("Convers�o incorreta ao converter 0 cent�metros em metros", 0, ConversorDeUnidade.converterCentimentrosParaMetros(0), PRECISAO_DE_CONVERSAO);
	}
	
}

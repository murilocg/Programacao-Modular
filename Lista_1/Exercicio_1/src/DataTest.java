
import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	private static final int TIME_OUT = 5000;

	@Test(timeout = TIME_OUT)
	public void testAdicionaDiasSemViradas() {
		adicionaDiasHelper(2049, 1, 1, 30, 2049, 1, 31);
		adicionaDiasHelper(2049, 1, 1, 0, 2049, 1, 1);
	}

	@Test(timeout = TIME_OUT)
	public void testAdicionaDiasViradaDeMes() {
		adicionaDiasHelper(2049, 1, 1, 59, 2049, 3, 1);
	}

	@Test(timeout = TIME_OUT)
	public void testAdicionaDiasViradaDeAno() {
		adicionaDiasHelper(2049, 1, 1, 365, 2050, 1, 1);
	}

	@Test(timeout = TIME_OUT)
	public void testProximoDia() {
		proximoDiaHelper(2049, 1, 1, 2049, 1, 2);
	}

	@Test(timeout = TIME_OUT)
	public void testProximoDiaViradaDeMes() {
		proximoDiaHelper(2049, 1, 31, 2049, 2, 1);
	}

	@Test(timeout = TIME_OUT)
	public void testProximoDiaViradaDeAno() {
		proximoDiaHelper(2049, 12, 31, 2050, 1, 1);
	}

	@Test(timeout = TIME_OUT)
	public void testDiaDaSemana() {
		Data data = new Data(2018, 2, 19);
		assertEquals("Dia da semanana inválido na data: " + data.getDia(), "Segunda", data.diaDaSemana());
		data.proximoDia();
		assertEquals("Dia inválido após aplicar proximoDia() na data: 19/02/2018", "Terça", data.diaDaSemana());
		data.adicionaDias(3);
		assertEquals("Dia inválido após adicionar 3 dias à data: 20/02/2018", "Sexta", data.diaDaSemana());
	}

	@Test(timeout = TIME_OUT)
	public void testDiaDaSemanaViradaDeSemana() {
		Data data = new Data(2018, 2, 24);
		data.proximoDia();
		assertEquals("Dia da semanana inválido ao virar a semana, na data: 24/02/2018", "Domingo", data.diaDaSemana());
	}

	private void adicionaDiasHelper(int ano, int mes, int dia, int addDias, int espAno, int espMes, int espDia) {
		Data data = new Data(ano, mes, dia);
		data.adicionaDias(addDias);
		Data dataEsp = new Data(espAno, espMes, espDia);
		assertEquals("Data inválida ao adicionar " + addDias + " dias à data " + dia + "/" + mes + "/" + ano, dataEsp,
				data);
	}

	private void proximoDiaHelper(int ano, int mes, int dia, int anoEsp, int mesEsp, int diaEsp) {
		Data data = new Data(ano, mes, dia);
		data.proximoDia();
		Data dataEsp = new Data(anoEsp, mesEsp, diaEsp);
		assertEquals("Data inválida ao ir para o próximo dia na data: " + dia + "/" + mes + "/" + ano, dataEsp, data);
	}
}

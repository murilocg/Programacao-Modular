
import java.time.LocalDate;

public class Data {

	private int ano;
	private int mes;
	private int dia;
	private static final int DIAS_MES[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String DIAS_SEMANA[] = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado",
			"Domingo" };
	private static final String MESES[] = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho",
			"setembro", "outubro", "novembro", "dezembro" };

	public Data(int ano, int mes, int dia) {
		if (ano > 0 && mes > 0 && mes < 13) {
			this.mes = mes;
			if (dia > 0 && dia <= diasNoMes()) {
				this.dia = dia;
				this.ano = ano;
			} else {
				this.mes = 0;
			}
		}
	}

	public Data() {
		LocalDate now = LocalDate.now();
		this.dia = now.getDayOfMonth();
		this.mes = now.getMonthValue();
		this.ano = now.getYear();
	}

	public void proximoDia() {
		adicionaDias(1);
	}

	public boolean eAnoBisexto() {
		return this.ano % 400 == 0 || (this.ano % 4 == 0 && this.ano % 100 > 0);
	}

	public String diaDaSemana() {
		int y = this.ano;
		int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		y -= mes < 3 ? mes : 0;
		int w = (y + y / 4 - y / 100 + y / 400 + t[mes - 1] + dia) % 7;
		return DIAS_SEMANA[w];
	}

	public int diasNoMes() {
		if (mes == 2 && eAnoBisexto())
			return DIAS_MES[mes - 1] + 1;
		return DIAS_MES[mes - 1];
	}

	public void adicionaDias(int dias) {
		do {
			if (this.dia + dias <= diasNoMes()) {
				this.dia += dias;
				dias = 0;
			} else {
				dias -= diasNoMes() - this.dia + 1;
				this.dia = 1;
				proximoMes();
			}
		} while (dias > 0);
	}

	private void proximoMes() {
		if (mes == 12) {
			mes = 1;
			ano++;
		} else {
			mes++;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public String porExtenso() {
		if (mes == 0 || dia == 0 || ano == 0)
			return "Data inválida";
		StringBuilder descricaoData = new StringBuilder();
		descricaoData.append(this.dia + " de " + MESES[this.mes - 1] + " de " + this.ano);
		return descricaoData.toString();
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}
}

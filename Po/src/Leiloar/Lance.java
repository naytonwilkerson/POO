package Leiloar;

public class Lance {

	private String nomeArrematante;
	private Integer valor;

	public Lance(String nomeArrematante, Integer valor) {
		super();
		this.nomeArrematante = nomeArrematante;
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public String setNomeArrematante(String nomeArrematante) {

		return this.nomeArrematante = nomeArrematante;
	}

	public String getNomeArrematante() {

		return nomeArrematante;
	}

}

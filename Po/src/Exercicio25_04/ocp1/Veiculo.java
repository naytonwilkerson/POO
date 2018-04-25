package ocp1;


public class Veiculo implements ManipuladorDeEventos{


	private int potencia;
	private int alturaSuspencao;

	
	public Veiculo(int potencia, int alturaSuspencao) {
		super();
		this.potencia = potencia;
		this.alturaSuspencao = alturaSuspencao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAlturaSuspencao() {
		return alturaSuspencao;
	}

	public void setAlturaSuspencao(int alturaSuspencao) {
		this.alturaSuspencao = alturaSuspencao;
	}

}

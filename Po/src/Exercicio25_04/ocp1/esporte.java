package ocp1;

public class esporte extends Veiculo {

	private int potencia;
	private int suspen��o;

	public esporte(int potencia, int alturaSuspencao) {
		super(potencia, alturaSuspencao);
		this.potencia = potencia;
		this.suspen��o = alturaSuspencao;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAlturaSuspencao() {
		return suspen��o;
	}

	public void setAlturaSuspencao(int alturaSuspencao) {
		this.suspen��o = alturaSuspencao;
	}

}

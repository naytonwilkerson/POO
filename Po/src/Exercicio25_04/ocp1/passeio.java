package ocp1;

public class passeio extends Veiculo {
	private int potencia;
	private int suspenção;

	public passeio( int potencia, int alturaSuspencao) {
		super(potencia, alturaSuspencao);
		this.potencia = potencia;
		this.suspenção = alturaSuspencao;
		
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAlturaSuspencao() {
		return suspenção;
	}

	public void setAlturaSuspencao(int alturaSuspencao) {
		this.suspenção = alturaSuspencao;
	}
}

package isp;

public abstract class Veiculo extends ligaDesliga {

	private boolean motorLigado1;

	public boolean isMotorRodando() {
		return motorLigado1;
	}

	@Override
	public void ligar() {
		motorLigado1 = true;
	}

	@Override
	public void desligar() {
		motorLigado1 = false;
	}

}
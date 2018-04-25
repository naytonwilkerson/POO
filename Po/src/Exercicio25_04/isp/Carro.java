package isp;

public class Carro extends Veiculo {

	private boolean radioOn;

	public boolean isRadioOn() {
		return radioOn;
	}

	@Override
	public void ligarRadio() {
		radioOn = true;
	}

	@Override
	public void desligarRadio() {
		radioOn = false;
	}

}
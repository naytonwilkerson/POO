package equipamento;

public class Equipamento {

	private boolean ligado;

	public Equipamento(boolean ligado) {
		super();
		this.ligado = ligado;
	}

	void liga() {
		ligado = true;
	}

	void desligar() {
		ligado = false;
	}

}

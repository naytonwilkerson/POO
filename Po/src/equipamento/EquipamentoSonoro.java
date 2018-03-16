package equipamento;

public class EquipamentoSonoro extends Equipamento {

	private int volume;
	private boolean stereo;

	public EquipamentoSonoro(boolean ligado, int volume, boolean stereo) {
		super(ligado);
		this.volume = volume;
		this.stereo = stereo;
	}

	void mono() {
		stereo = false;
	}

	void stereo() {
		stereo = true;
	}

	void liga() {
		volume = 5;
	}
}

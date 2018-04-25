package isp;

public class Drone extends Veiculo {

	private boolean cameraOn;

	public boolean isCameraOn() {
		return cameraOn;
	}

	@Override
	public void ligarCamera() {
		cameraOn = true;
	}

	@Override
	public void desligarCamera() {
		cameraOn = false;
	}

}

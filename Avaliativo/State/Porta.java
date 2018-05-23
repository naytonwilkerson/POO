package State;

public class Porta {

	private EstadoPorta estado;

	public Porta() {
	}

	public void setEstado(Object object) {

	}

	public EstadoPorta getEstado() {
		return estado;

	}

	public void click() {
		estado.click(this);
	}

	public void fimDeCiclo() {

	}

	public void timeOut() {
	}

	public static void main(String[] args) {
		Porta porta = new Porta(); // Fechada
		porta.click();
		porta.timeOut();
		porta.click();
		porta.getEstado();
	}

}

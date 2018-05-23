package State;

public class portaAbrindo extends EstadoPorta {
	
	Porta porta;

	public portaAbrindo(Porta porta) {
		super();
		this.porta = porta;
	}

	public void click() {

		porta.setEstado(new portaAberta(porta));
	}

}


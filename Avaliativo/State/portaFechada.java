package State;

public class portaFechada extends EstadoPorta {

	Porta porta;

	public portaFechada(Porta porta) {
		super();
		this.porta = porta;
	}

	public void click() {
		
		porta.setEstado(new portaAbrindo(porta));
	}

}

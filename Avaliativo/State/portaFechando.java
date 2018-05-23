package State;

public class portaFechando {

	Porta porta;

	public portaFechando(Porta porta) {
		super();
		this.porta = porta;
	}

	public void click() {

		porta.setEstado(new portaFechada(porta));
	}

}

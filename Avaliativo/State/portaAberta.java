package State;

public class portaAberta {
	Porta porta;

	public portaAberta(Porta porta) {
		super();
		this.porta = porta;
	}

	public void click() {

		porta.setEstado(new portaFechando(porta));
	}
}

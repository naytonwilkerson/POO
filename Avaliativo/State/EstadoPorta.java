package State;

public abstract class EstadoPorta extends Porta {

	public void click(Porta porta) {
		System.out.println("Erro!");
	}

	void fimDeCiclo(Porta porta) {
		System.out.println("Erro");
	}

	void timeOut(Porta porta) {
		System.out.println("Erro!!");
	}
}

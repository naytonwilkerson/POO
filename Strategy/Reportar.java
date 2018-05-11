package Strategy;

public abstract class Reportar {

	public void gerarRelatorio() {
		cabe�alho();
		corpo();
		rodape();
	}
	public abstract void cabe�alho();

	public abstract void corpo();

	public abstract void rodape();
}

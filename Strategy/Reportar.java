package Strategy;

public abstract class Reportar {

	public void gerarRelatorio() {
		cabeçalho();
		corpo();
		rodape();
	}
	public abstract void cabeçalho();

	public abstract void corpo();

	public abstract void rodape();
}

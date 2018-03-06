package Leiloar;

public class Leilão {

	private String bemLeiloado;
	private Double valorInicial;
	private boolean abertoFechado;

	

	public Leilão(String bemLeiloado ,Double valorInicial,boolean abertoFechado) {
		super();
		this.bemLeiloado = bemLeiloado;
		this.valorInicial = valorInicial;
		this.abertoFechado = abertoFechado;
	}

	public void registrarLance(String nome, Double valor) {

		if (valor > valorInicial) {

			valorInicial = valor;

		}

	}

	public String finalizar(String nome, Double valor) {

		return nome+valor;
		
	}
	
}

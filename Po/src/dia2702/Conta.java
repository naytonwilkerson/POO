package dia2702;

public class Conta {

	private String titular;

	public Conta() {

		// * Para que Seja possivel ser executada uma a��o sem que o �suario interaja
		// com o software. //*

		System.out.println(" ");

	}

	public Conta(String titular) {
		super();
		this.titular = titular;

		System.out.println(this.titular);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}

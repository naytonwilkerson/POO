package OCP;

public class Vendedor extends Funcionario {

	public double totalVendas;

	public Vendedor(double totalVendas, double salarioBase, String nome) {
		super("vendedor", salarioBase, nome);
		this.totalVendas = totalVendas;
	}

	public double calcula() {

		return totalVendas * getSalarioBase();

	}

}

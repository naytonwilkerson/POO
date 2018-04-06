package OCP;

public class Assistente extends Funcionario {

	public Assistente(double salarioBase, String nome) {
		super("Assistente", salarioBase, nome);

	}

	public double calcula() {
		
		return getSalarioBase()+10;
		
	}
}

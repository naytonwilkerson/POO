package OCP;

public class Gerente extends Funcionario {

	public Gerente( double salarioBase, String nome) {
		super("Gerente", salarioBase, nome);
		
	}
	
	
	public double calcula() {
		
		return getSalarioBase()*2;
		
	}
	
	
		
	
	
	
}

package Nome;

public class Programa {
	public static void main(String[] args) {

		Pessoa p = new Pessoa("Nayton", "Wilkerson");
		Funcionario f = new Funcionario("Leonardo", "Messias", 1000.00, 100);
		Professor prof = new Professor("Antonio", "Silva", 1500.00, 200);

		System.out.println(p.getNomeCompleto());

		System.out.println(f.getNomeCompleto());
		System.out.println(f.getSalarioPrimeiraParcela());
		System.out.println(f.getSalarioSegundaParcela());

		System.out.println(prof.getNomeCompleto());
		System.out.println(prof.getSalarioPrimeiraParcela());
		System.out.println(prof.getSalarioSegundaParcela());

	}
}

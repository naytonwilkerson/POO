package Nome;

public class Funcionario extends Pessoa {

	private int Matricula;
	protected double Salario;

	public Funcionario(String Nome, String SobreNome, double Salario, int Matricula) {
		super(Nome, SobreNome);
		this.Matricula = Matricula;
		this.Salario = Salario;
	}

	void setSalario(int valor) {

		if (valor > 0) {

			Salario = valor;

		}

	}

	double getSalarioPrimeiraParcela() {

		return (Salario * 60) / 100;

	}

	double getSalarioSegundaParcela() {

		return (Salario * 40) / 100;
	}
}

package Nome;

public class Professor extends Funcionario {

	public Professor(String Nome, String SobreNome, double Salario, int Matricula) {
		super(Nome, SobreNome, Salario, Matricula);
	}

	double getSalarioPrimeiraParcela() {

		return Salario;

	}

	double getSalarioSegundaParcela() {

		return 0;
	}
}

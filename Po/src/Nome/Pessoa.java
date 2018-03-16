package Nome;

public class Pessoa  {
	
	private String Nome;
	private String SobreNome;

	public Pessoa() {
		super();
	}

	public Pessoa(String Nome, String SobreNome) {
		super();
		this.Nome = Nome;
		this.SobreNome = SobreNome;

	}

	public String getNomeCompleto() {

		return Nome + " " + SobreNome;

	}

}

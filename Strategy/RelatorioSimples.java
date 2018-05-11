package Strategy;

public class RelatorioSimples extends Reportar {

	public void cabeçalho() {
		System.out.println(DadosBancarios.getNomeDoBanco());
		System.out.println("=========================================");
		System.out.println();
	}

	public void corpo() {
		System.out.println(DadosBancarios.DadosSimples());
		System.out.println(DadosBancarios.DadosSimples());
		System.out.println(DadosBancarios.DadosSimples());
		System.out.println(DadosBancarios.DadosSimples());
	}

	public void rodape() {
		System.out.println();
		System.out.println("=========================================");
		System.out.println(DadosBancarios.getTelefone());
	}
}

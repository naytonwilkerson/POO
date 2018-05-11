package Strategy;

public class RelatorioComplexo extends Reportar {

	public void cabeçalho() {

		System.out.println(DadosBancarios.getNomeDoBanco() + " - " + DadosBancarios.getEndereco() + " - "
				+ DadosBancarios.getTelefone());
		System.out.println("===============================================================");
		System.out.println();
	}

	public void rodape() {
		System.out.println();
		System.out.println("===============================================================");
		System.out.println(DadosBancarios.Email() + " - " + DadosBancarios.getDate());
	}

	public void corpo() {

		System.out.println(DadosBancarios.Dadoscomplexo());
		System.out.println(DadosBancarios.Dadoscomplexo());
		System.out.println(DadosBancarios.Dadoscomplexo());
		System.out.println(DadosBancarios.Dadoscomplexo());
		System.out.println(DadosBancarios.Dadoscomplexo());
		System.out.println(DadosBancarios.Dadoscomplexo());

	}
}

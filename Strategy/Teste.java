package Strategy;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Reportar relatorio;
		
		relatorio = new RelatorioSimples();
		relatorio.gerarRelatorio();
		
		//relatorio = new RelatorioComplexo();
		//relatorio.gerarRelatorio();
		
		sc.close();
	}
}

package ocp1;

import java.util.Scanner;

public interface ManipuladorDeEventos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Veiculo veiculoEsporte = new esporte(500, 10);
		Veiculo veiculoPasseio = new passeio(400, 20);

		System.out.println(veiculoEsporte.getAlturaSuspencao());
		System.out.println(veiculoEsporte.getPotencia());

		System.out.println(veiculoPasseio.getAlturaSuspencao());
		System.out.println(veiculoPasseio.getPotencia());

	}
}

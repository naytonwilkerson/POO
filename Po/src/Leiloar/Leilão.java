package Leiloar;

import AlugaFilmes.filme;

public class Leilão {

	private String bemLeiloado;
	private Integer valorMinimo;
	private boolean status;
	private Lance lanceVencedor;
	

	public Leilão(String bemLeiloado, Integer valorMinimo) {
		super();
		this.bemLeiloado = bemLeiloado;
		this.valorMinimo = valorMinimo;
		this.status = true;
	}

	public void registrarLance(String nome, Integer valor) {
		if (status) {
			
			if (lanceVencedor != null && valor > lanceVencedor.getValor()) {
				lanceVencedor.setNomeArrematante(nome);
				lanceVencedor.setValor(valor);
			} else if (lanceVencedor == null && valor > valorMinimo) {
				lanceVencedor = new Lance(nome, valor);
			}
		}

	}

	public void finalizar() {

		status = false;
		if (lanceVencedor != null) {
			System.out.println("Bem leiloado: " + bemLeiloado);
			System.out.println("Nome do arrematante: " + lanceVencedor.getNomeArrematante());
			System.out.println("Valor:" + lanceVencedor.getValor());
		} else {
			System.out.println("Sem lance vencedor");
		}
	}

}

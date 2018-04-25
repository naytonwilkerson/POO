package SRP;

public class Combustivel extends Veiculo {

	private int capacidade;
	
	public Combustivel(int capacidadeTanque) {
		super(capacidadeTanque);
		this.capacidade = capacidadeTanque;
	}

	public void reabastecimento() {
		 setQuantidadeCombustivel(capacidade);
	}

	public void acelerar() {
		setQuantidadeCombustivel(capacidade);
	}

}

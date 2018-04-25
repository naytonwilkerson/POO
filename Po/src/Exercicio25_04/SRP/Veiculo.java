package SRP;

public class Veiculo {
	  private final int capacidadeTanqueCombustivel;
	    private int quantidadeCombustivel;

	    public Veiculo(int capacidadeTanque) {
	        this.capacidadeTanqueCombustivel = capacidadeTanque;
	        this.quantidadeCombustivel = capacidadeTanque;
	    }

	    
	    public int getQuantidadeCombustivel(int valor) {
			return quantidadeCombustivel-valor;
		}

		public void setQuantidadeCombustivel(int quantidadeCombustivel) {
			this.quantidadeCombustivel = quantidadeCombustivel;
		}

		public int getCapacidadeTanqueCombustivel() {
			return capacidadeTanqueCombustivel;
		}

	   
}

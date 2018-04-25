package Exercicio25_04.dip;

public class CarroDeCorrida implements interf{
	
	private final int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;
    private int potencia;

    public CarroDeCorrida(final int combustivel) {
        this.capacidadeTanqueCombustivel = combustivel;
        this.quantidadeCombustivel = combustivel;
    }

    public void acelerar(){
        potencia++;
        quantidadeCombustivel--;
    }
}

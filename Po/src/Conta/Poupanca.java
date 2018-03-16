package Conta;

public class Poupanca extends Conta {

	private int diaRendimento;

	public Poupanca(double saldo, int diaRendimento) {
		super(saldo);
		this.diaRendimento = diaRendimento;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	
	void sacar(double valor) {
		if (valor > 0) {
			saldo -= valor;
		}
	}
}

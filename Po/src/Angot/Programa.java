package Angot;

public class Programa {

	public void testeMetodoCalcula() {

		TabelaDePreco simuladorDeTabela = mock(TabelaDePreco.class);
		ServicoDeEntrega simuladorDeEntrega = mock(ServicoDeEntrega.class);

		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(simuladorDeTabela, simuladorDeEntrega);

		((Object) when(simuladorDeTabela.descontoPara(50))).thenReturn(5.0);
		((Object) when(simuladorDeEntrega.para("SP"))).thenReturn(10.0);

		double valor = calculadora.calcula(55.0);

		assertEquals(55.0, valor, 0.0001);
	}

	private Object when(double descontoPara) {

		return null;

	}
}

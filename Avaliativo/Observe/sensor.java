package Observe;

public class sensor {

	public static void main(String[] args) {
		sistemaDeAlarme porta = new sistemaDeAlarme();
		
		if (porta.getDisparaAlarme("Acionado").equals("Acionado")) {

			porta.PoliciaA();
			porta.Seguro();
		}

	}
}

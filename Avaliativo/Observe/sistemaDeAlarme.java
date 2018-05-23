package Observe;

public class sistemaDeAlarme {

	public static String getDisparaAlarme(String alarme) {
		return alarme;
	}

	public static void Seguro() {
		System.out.println("Calcular perdas!");
	}

	public static void PoliciaA() {
		System.out.println("Viaturas Acionadas!!");
	}

	public static String setDisparaAlarme(String status) {

		getDisparaAlarme(status);

		if (status.equals("Acionado")) {
			Seguro();
			PoliciaA();
			return status;
		}

		return status;

	}

}

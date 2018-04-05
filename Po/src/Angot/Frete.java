package Angot;

public class Frete {

	public double para(String cidade) {

		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;

		} else if ("Rio De Janeiro".equals(cidade.toUpperCase())) {
			return 30;
		}
		return 0;
	}
}
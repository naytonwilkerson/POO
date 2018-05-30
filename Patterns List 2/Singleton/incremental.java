package Singleton;

class incremental {
	private static int count = 0;
	private int numero;
	static incremental inc = new incremental();

	public void incremental() {
		numero = ++count;
	}
	
	public static Object objeto() {
		return inc;
	}

	public String toString() {
		return " Incremental: " + numero;
	}

	
}

package Leiloar;

import java.util.*;

public class Sistema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 Leilão ll = new Leilão("Vaca" , 300 );
		
		 ll.registrarLance("Nayton", 400);
		 ll.registrarLance("NaytonW", 450);
		 ll.registrarLance("NaytonWI", 200);
		 ll.registrarLance("NaytonWIL", 470);
		 ll.registrarLance("NaytonWILK", 550);
		ll.finalizar();
	}
}

package exercioDeFixa��o;

import java.util.ArrayList;
import java.util.Random;

public class mRandomico implements MetodosDeAmostragem {

	@Override
	public int[] amostra(int tamanhoAmostra, int[] populacao) {
		int[] subConjunto = new int[tamanhoAmostra];
		Random generator = new Random();
		// faz uma c�pia usando ArrayList
		// fica f�cil amostrar sem repetir
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 0; i < populacao.length; i++)
			tempArray.add(populacao[i]);
		
		for (int i = 0; i < tamanhoAmostra; i++)
			subConjunto[i] = tempArray.remove(generator.nextInt(tempArray.size()));

		return subConjunto;
	}
}

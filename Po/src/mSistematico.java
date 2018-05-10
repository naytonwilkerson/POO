package exercioDeFixa��o;

import java.util.Arrays;
import java.util.Random;

public class mSistematico implements MetodosDeAmostragem {

	@Override
	public int[] amostra(int tamanhoAmostra, int[] populacao) {
		int[] subConjunto = new int[tamanhoAmostra];
		Random generator = new Random();
		// faz copia da popula��o.
		// n�o queremos causar efeitos colaterais.
		int[] populacaoOrdenada = new int[populacao.length];
		System.arraycopy(populacao, 0, populacaoOrdenada, 0, populacao.length);
		Arrays.sort(populacaoOrdenada);

		int step = populacaoOrdenada.length / tamanhoAmostra;
		int startingPoint = generator.nextInt(step);

		// seleciona elementos em intervalo regular ‘step’
		for (int i = 0; i < tamanhoAmostra; i++)
			subConjunto[i] = populacaoOrdenada[startingPoint + (i * step)];

		return subConjunto;
	}
}

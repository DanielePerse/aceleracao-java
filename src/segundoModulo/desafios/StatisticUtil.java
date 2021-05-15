package segundoModulo.desafios;

import java.util.Arrays;

public class StatisticUtil {
	public static int average(int[] elements) {
		int sumElements = 0;
		
		for(int i = 0; i < elements.length; i++) {
			sumElements += elements[i];
		}
	
		return sumElements/elements.length;
	}


	public static int mode(int[] elements) {
		int ocorrencia = 0;
		int comparacao = 0;
		int moda = 0;
		
		for(int i = 0; i < elements.length; i++) {
			for(int j = 0; j < elements.length; j++) {
				if(elements[i] == elements[j]) {
					ocorrencia++;
				}
			}
			if (ocorrencia > comparacao) {
				moda = elements[i];
				comparacao = ocorrencia;
			}
		}

		return moda;
	}
	

	public static int median(int[] elements) {
		
		Arrays.sort(elements);
		int result = 0;
		
		if (elements.length % 2 == 1) {
			int calcImpar = (elements.length / 2);
			result = elements[calcImpar];
		} else {
			int calcPar1 = (elements.length / 2 - 1);
			int calcPar2 = (elements.length / 2);
			int calcPar = (calcPar1 + calcPar2) / 2;
			result = elements[calcPar];
		}
		
		return result;
	}
}

package primeiroModulo.desafios;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {
	public static int calcFibonacci(int num) {
		if (num < 2) {
			return num;
		} else {
			return calcFibonacci(num - 1) + calcFibonacci(num -2);
		}
	}

	public static List<Integer> fibonacci() {
		List<Integer> listFibonacci = new ArrayList<Integer>();

		for (int i = 0; calcFibonacci(i) <= 350; i++) {
			listFibonacci.add(calcFibonacci(i));
		}

		return listFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}
}

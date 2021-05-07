package primeiroModulo.desafios;

import java.util.ArrayList;
import java.util.List;

public class DesafioFibonacci {
	
	public int fibonacci(int num) {
		if (num < 2) {
			return num;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
	
//	public List<Integer> listFibonacci1() {
//		List<Integer> sequenciaFibonacci = new ArrayList<Integer>();
//
//		for (int i = 0; fibonacci(i) <= 350; i++) {
//			sequenciaFibonacci.add(fibonacci(i));
//		}
//		
//		return sequenciaFibonacci;
//	}
	
	public List<Integer> listFibonacci() {
		List<Integer> sequenciaFibonacci = new ArrayList<Integer>();
		
		int i = 0;
		boolean stop = false;

		while (!stop) {
			int numberFibonacci = fibonacci(i);
			sequenciaFibonacci.add(numberFibonacci);
			i++;
			
			if (numberFibonacci > 350) {
				stop = true;
			}
		}
		
		return sequenciaFibonacci;
	}
	
	public Boolean isFibonnaci(int num) {
		DesafioFibonacci desafioFibonacci = new DesafioFibonacci();
		
		return desafioFibonacci.listFibonacci().contains(num);
	}
	
	public static void main(String[] args) {
		DesafioFibonacci desafioFibonacci = new DesafioFibonacci();
		
		System.out.println(desafioFibonacci.listFibonacci());
		System.out.println(desafioFibonacci.isFibonnaci(377));
	}
}

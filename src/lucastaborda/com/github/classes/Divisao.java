package lucastaborda.com.github.classes;

import lucastaborda.com.github.interfaces.ICalculadora;

public class Divisao implements ICalculadora{

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if(n2.equals(0)) {
			return (int) 0;
		}
	   return n1 / n2;
	 }

	@Override
	public Float calcula(Float n1, Float n2) {
		if(n2.equals(0)) {
			return (float) 0;
		}
	   return n1 / n2;
	 }

	@Override
	public Double calcula(Double n1, Double n2) {
		if(n2.equals(0)) {
			return (double) 0;
		}
	   return n1 / n2;
	 }

	@Override
	public Integer calcula(Integer[] numbers) {
		Integer tamanho = numbers.length;
			if (tamanho == 0) {
				return null;
			}
			
		Integer divisao = numbers[0];
			for (int i = 1; i < numbers.length; i++) {
				divisao /= numbers[i];
			}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numbers) {
		Integer tamanho = numbers.length;
			if (tamanho == 0) {
				return null;
			}
			
		Float divisao = numbers[0];
			for (int i = 1; i < numbers.length; i++) {
				divisao /= numbers[i];
			}
		return divisao;
	}
	
	@Override
	public Double calcula(Double[] numbers) {
		Integer tamanho = numbers.length;
			if (tamanho == 0) {
				return null;
			}
			
		Double divisao = numbers[0];
			for (int i = 1; i < numbers.length; i++) {
				divisao /= numbers[i];
			}
		return divisao;
	}
}
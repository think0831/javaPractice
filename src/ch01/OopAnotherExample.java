package ch01;


public class OopAnotherExample {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorService(new Addition());
		final int additionResult = calculatorService.calculate(1, 1);
		System.out.println(additionResult);

		calculatorService = new CalculatorService(new Subtraction());
		final int subtractionResult = calculatorService.calculate(1, 1);
		System.out.println(subtractionResult);
	}

}

interface Calculation {
	int calculate(final int num1, final int num2);
}

class Addition implements Calculation {
	@Override
	public int calculate(final int num1, final int num2) {
		return num1 + num2;
	}
}

class Subtraction implements Calculation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}
}

class CalculatorService {
	private Calculation calculation;

	public CalculatorService(final Calculation calculation) {
		this.calculation = calculation;
	}

	public int calculate(int num1, int num2) {
		if (num1 > 10 && num2 > num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException("invalid input num1: " + num1 + ", num2: " + num2);
		}
	}
}

package ch01;

public class FpExample {
	public static void main(String[] args) {
		final FpCalculatorService fpCalculatorService = new FpCalculatorService();
		System.out.println("   addition: " + fpCalculatorService.calculate(new Addition(), 11, 2));
		System.out.println("subtraction: " + fpCalculatorService.calculate(new Subtraction(), 12, 2));

		// 람다식
		System.out.println("   addition: " + fpCalculatorService.calculate((i1, i2) -> i1 + i2, 11, 2));
		System.out.println("subtraction: " + fpCalculatorService.calculate((i1, i2) -> i1 - i2, 12, 2));
		System.out.println("custom calc: " + fpCalculatorService.calculate((i1, i2) -> ((i1 + i2) * 2) / 2, 12, 2));

		final Calculation addtion = (i1, i2) -> i1 + i2;

		System.out.println("   addition: " + fpCalculatorService.calculate(addtion, 11, 2));


	}

}

class FpCalculatorService {
	public int calculate(Calculation calculation, int num1, int num2) {
		if (num1 > 10 && num2 < num1) {
			return calculation.calculate(num1, num2);
		} else {
			throw new IllegalArgumentException();
		}
	}
}

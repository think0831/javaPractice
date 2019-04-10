package ch02;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceExamples {
	public static void main(String[] args) {
		Function<String, Integer> toInt = new Function<String, Integer>() {
			@Override
			public Integer apply(final String value) {
				return Integer.parseInt(value);
			}
		};

		Integer number = toInt.apply("1000");
		System.out.println(number);

		Function<String, Integer> toInt2 = (final String value) -> {return Integer.parseInt(value);};

		number = toInt2.apply("100");
		System.out.println(number);

		Function<String, Integer> toInt3 = (value) -> Integer.parseInt(value);

		number = toInt3.apply("10");
		System.out.println(number);

//		Function<Integer, Integer> identity = Function.identity();
		Function<Integer, Integer> identity = t -> t;

		System.out.println(identity.apply(100));

		Consumer<String> print = (value) -> {System.out.println(value);};

		print.accept("hello");

	}

}

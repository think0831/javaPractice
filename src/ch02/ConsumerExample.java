package ch02;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerExample {
	public static void main(String[] args) {
		final Consumer<String> print = new Consumer<String>() {
			@Override
			public void accept(String value) {
				System.out.println(value);
			}
		};

		final Consumer<String> print2 = value -> System.out.println(value + "gentelman");
//		final Function<String> print2 = value -> System.out.println(value); // bed return type Function은 리턴값이 있어야한다.

		print2.accept("greetings");

	}

}

package ch01;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {
	public static void main(String[] args) {

		// 기존
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		final StringBuilder stringBuilder = new StringBuilder();

		for (Integer number : numbers) {
			stringBuilder.append(number).append(" : ");

		}
		if (stringBuilder.length() > 0) {
			stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
		}

		System.out.println(stringBuilder.toString());

		// stream 사용
		final String result = numbers.stream()
				.map(String::valueOf)
				.collect(joining(" : "));
		System.out.println(result);

	}
}

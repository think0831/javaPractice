package napda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaExpression {
	public static void main(String[] args) {
//		Function<Integer, Integer> func = (p1, p2) -> {
//			return p1;
//		};
//
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<Integer> result = new ArrayList<>();
//		for (Integer number : list) {
//			if (number > 2) {
//				result.add(number);
//			}
//		}
//		System.out.println(result);
//
//
//		List<Integer> result2 = new ArrayList<>();
//		for (Integer number : list) {
//			if (number < 7) {
//				result2.add(number);
//			}
//		}
//		System.out.println(result2);
//
//
//		List<Integer> result3 = filter(list, new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer integer) {
//				return integer > 8;
//			}
//		});
//		System.out.println(result3);
//
//
//		List<Integer> result4 = filter(list ,integer -> {return integer < 5;});
//		System.out.println(result4);
//
//		Predicate<Integer> greaterThan2 = integer -> integer > 2; // anonymous function
//		Predicate<Integer> lessThan8 = integer -> integer < 8; // anonymous function
//
//		List<Integer> result5 = filter(list, greaterThan2.and(lessThan8));
//		System.out.println(result5);

		int val = 10;
		Arrays.asList(1, 2, 3, 4, 5)
				.forEach(i -> i = i + i);

		int[] sum = new int[1];
		int total = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
				.parallelStream()
				.reduce(0, (i1, i2) -> i1 + i2);
				//.forEach(i -> sum[0] = sum[0] + i);
		System.out.println(total);

	}

	private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T value : list) {
			if (predicate.test(value)) {
				result.add(value);
			}
		}
		return result;
	}
}

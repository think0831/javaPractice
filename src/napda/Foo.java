package napda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Foo {
	public static void main(String[] args) throws IOException {
		try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\MASTER-KJY\\IdeaProjects\\JavaPractice\\src\\napda\\test.txt"))) {
			List list = lines.map(line -> line.split("[\\s]+"))
					.flatMap(Arrays::stream)
					.distinct()
					.sorted()
					.collect(toList());

			System.out.println(list);
		}

		String[] strArray = new String[5];

		strArray[0] = "1";
		strArray[1] = "2";
		strArray[2] = "3";
		strArray[3] = "4";
		strArray[4] = "5";

		Stream<String> stream = Arrays.stream(strArray);
		stream.collect(joining(" : "));


	}

}

package programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		Stream<Integer> s = list.stream();

		Integer result = list.stream().filter(i -> i % 2 == 0).map(t -> t * 2).reduce(0, Integer::max);

		System.out.println(result);

	}

}

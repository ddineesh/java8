import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class StreamCollectorExamples {

	public static void main(String args[]) {
		List<String> names = Arrays.asList("David", "John", "Smith", "Jackie", "Smith", "John");

		/*
		 * we are grouping the elements of a list using groupingBy() method of
		 * Collectors class and printing the occurrences of each element in the list.
		 */

		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Map::" + map);
		
	}

}
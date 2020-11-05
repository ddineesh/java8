package com.dinesh;

import java.util.Arrays;

public class ParallelSortExample {

	public static void main(String[] args) {
		int[] numbers= {98,22, 89, 1, 32, 19, 5};
		
		//Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);
		
		Arrays.stream(numbers).forEach(n -> System.out.print(n+ " "));
		
		/* Specifying the start and end index. The start index is
		 * 1 here and the end index is 5. which means the the elements
		 * starting from index 1 till index 5 would be sorted.
		 */
		int[] numbers1= {98,22, 89, 1, 32, 19, 5};
		Arrays.parallelSort(numbers1, 1, 5);
		System.out.println(" The paralle sort with start and end index");
		System.out.println(" -----------------------------------------");
		//converting the array to stream and displaying using forEach
		Arrays.stream(numbers1).forEach(n->System.out.print(n+" "));
		

	}

}

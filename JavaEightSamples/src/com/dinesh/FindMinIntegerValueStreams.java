package com.dinesh;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class FindMinIntegerValueStreams {

	public static void main(String[] args) {

		List<Integer> intArray= Arrays.asList(44,34,35,1,98);
		
		int minimum=intArray.stream().mapToInt( v -> v).min().orElseThrow(NoSuchElementException::new);
		
		System.out.println(" Minimum:"+minimum);
		
		int maximum = intArray.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new);
		System.out.println("Maximum:"+maximum);
		
	}

}

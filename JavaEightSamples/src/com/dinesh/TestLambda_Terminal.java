package com.dinesh;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestLambda_Terminal {

	public static void main(String[] args) {
	    System.out.println("Stream without terminal operation");
	    
	    Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
	        System.out.println("doubling " + i);
	        return i * 2;
	    });
	 
	    System.out.println("Stream with terminal operation");
	        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
	            System.out.println("doubling " + i);
	            return i * 2;
	    }).sum();
	        
		/*
		 * Here's an example where we take a map of users' names and lists of phones and
		 * “flatten” it down to a list of phones of all the users using flatMap:
		 */
	        
	        Map<String, List<String>> people = new HashMap<>();
	        people.put("John", Arrays.asList("555-1123", "555-3389"));
	        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
	        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

	        List<String> phones = people.values().stream()
	          .flatMap(Collection::stream)
	            .collect(Collectors.toList());
	        
	        System.out.println(" phones Map: "+phones);
	}

}

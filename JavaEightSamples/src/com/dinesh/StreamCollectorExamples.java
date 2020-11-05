package com.dinesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.dinesh.pojo.Student;

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

		List<Student> studentlist = new ArrayList<Student>();
		// Adding Students
		studentlist.add(new Student(11, "Jon", 22));
		studentlist.add(new Student(22, "Steve", 18));
		studentlist.add(new Student(33, "Lucy", 22));
		studentlist.add(new Student(44, "Sansa", 23));
		studentlist.add(new Student(55, "Maggie", 18));
		// Fetching student names as List
		List<String> studentNameList = studentlist.stream().
				map(n -> n.getName()).collect(Collectors.toList());
		
		System.out.println(" Student Name List:"+studentNameList);
		
		//Getting the average Age 
		
		Double averageAge=studentlist.stream().collect(Collectors.averagingInt(stu -> stu.getAge()));
		System.out.println(" The aveage age of the students: "+ averageAge);
	}

}

package com.dinesh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import com.dinesh.pojo.Person;

public class CalculateMinAgeOfPerson {

	public static void main(String[] args) {

	 Person jill=new Person("Jill",45);
	 Person jack=new Person("Jack",35);
	 Person john=new Person("John",25);
	 
	 List<Person> personList=Arrays.asList(jill,jack,john);
	 
	 Person minAgePerson = personList.stream().min(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new);
	 System.out.println("Minimum Age person: "+ minAgePerson);
	 Person maxAgePerson = personList.stream().max(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new);
	 System.out.println(" Max Age Person:"+maxAgePerson);
	}

}

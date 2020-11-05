package com.dinesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestJavaStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Anderson");
		names.add("Jacky");
		names.add("Mitchell");
		System.out.println("The names have 6 and letter without Stream:"+countWithOutStreams(names));
		System.out.println("The names have 6 and letter with Stream:"+countWithStreams(names));
		ConcatenatingtwoStreams();
	}
	
	public static int countWithOutStreams(List<String> namesList)
	{
		int count=0;
		for(String str : namesList)
		{
			if(str.length() >= 6)
			{
					count ++;
			}
		}
		return count;
	}
	
	public static long countWithStreams(List<String> namesList)
	{
		long count=namesList.stream().filter(str ->str.length() >=6).count();
		
		return count;
	}
	
	public static void ConcatenatingtwoStreams()
	{
		List<String> wordList = Arrays.asList("J","A","K","M");
		List<String> namesList = Arrays.asList("John","Anderson","Jackie","Mitchell");
		
		Stream<String> opStream=Stream.concat(wordList.stream(), namesList.stream());
		System.out.print("The concatenated Streams::");
		opStream.forEach(str -> System.out.print(str+" "));
	}


}

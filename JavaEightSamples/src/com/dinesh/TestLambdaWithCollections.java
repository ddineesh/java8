package com.dinesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLambdaWithCollections {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Dinesh");
		names.add("Jill");
		names.add("Jang");
		names.add("Jack");
		
		names.forEach((name)->System.out.println(name));

		//in the above way we can iterate the Map as well
		
		Map<String,Integer> furitMap=new HashMap<>();
		furitMap.put("Apple", 15);
		furitMap.put("Orage", 10);
		furitMap.put("Avocado", 5);
		
		furitMap.forEach((k,v) ->System.out.println("Fruit: " + k + ", Price: " + v));
	}

}

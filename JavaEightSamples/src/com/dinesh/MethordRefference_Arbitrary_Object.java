package com.dinesh;

import java.util.Arrays;

public class MethordRefference_Arbitrary_Object {

	public static void main(String[] args) {  
		String[] stringArray = { "Dinesh", "Rick", "Jill", "Jang", "Jack","Smith"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
		}
	   }  
}


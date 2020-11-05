package com.dinesh;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		
		// Passing Hyphen(-) as delimiter
		StringJoiner joiner=new StringJoiner(",");
		
		// Joining multiple strings by using add() method
		joiner.add("John");
		joiner.add("Anderson");
		joiner.add("Jackie");
		joiner.add("Mitchell");
		
		//display the final output
		System.out.println(" My first String joiner: "+joiner);
		
		/* Passing comma(,) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
		StringJoiner names=new StringJoiner(",", "(", ")");
		
		names.add("John");
		names.add("Anderson");
		names.add("Jackie");
		names.add("Mitchell");
		//display the final output
		System.out.println(" My first String joiner with prefix and suffix: "+names);
		
		/* Passing comma(,) as delimiter and opening bracket
		 * "(" as prefix and closing bracket ")" as suffix
		 */
		StringJoiner mystring = new StringJoiner(",", "(", ")");    

	    /* Using setEmptyValue() method, we can set the default value
         * of a StringJoiner instance, so if the StringJoiner is empty
         * and we print the value of it, this default value will be
         * displayed
         */
        mystring.setEmptyValue("This is a default String");  
        
        /* We have not added any string to StringJoiner yet so
         * this should display the default value of StringJoiner
         */
        System.out.println("Default String: "+mystring);  

    	mystring.add("Negan");  
		mystring.add("Rick");  
		mystring.add("Maggie");  
		mystring.add("Daryl");  
		
		System.out.println("First String: "+mystring);
		
		/* The length() method of StringJoiner class returns the 
         * length of the string (the number of characters in the 
         * StringJoiner instance)
         */
        int length = mystring.length();  
        System.out.println("Length of the StringJoiner: "+length);  

		/* Passing hyphen(-) as delimiter and string "pre"
		 * as prefix and string "suff" as suffix
		 */
		StringJoiner myanotherstring = new StringJoiner("-", "pre", "suff");    

		myanotherstring.add("Sansa");  
		myanotherstring.add("Imp");  
		myanotherstring.add("Jon");  
		myanotherstring.add("Ned"); 

		System.out.println("Second String: "+myanotherstring);

		/* Merging both the strings  
		 * The important point to note here is that the output string will be 
		 * having the delimiter prefix and suffix of the first string (the string
		 * which is calling the merge method of StringJoiner)
		 */
		StringJoiner mergedString = mystring.merge(myanotherstring);   
		System.out.println(mergedString);  
	}

}

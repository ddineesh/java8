package com.dinesh;

import java.util.Optional;

public class TheOptionalExample {

	public static void main(String[] args) {

		String[] stateValue= new String[10];
		stateValue[0]="IL";
		Optional<String> checkNullable=Optional.ofNullable(stateValue[0]);
		
		if(checkNullable.isPresent())
		{
			String word=stateValue[0].toLowerCase();
			System.out.println("The lower case value: "+word);
		}else
		{
			System.out.println(" The state[0] is null");
		}
	}

}

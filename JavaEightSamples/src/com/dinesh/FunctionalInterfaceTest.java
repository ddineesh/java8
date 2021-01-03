package com.dinesh;

import com.dinesh.interfaces.FunctionalAddTwoNumbersInterface;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		FunctionalAddTwoNumbersInterface sum=(a,b)-> a+b;
		
		System.out.println("Two numbers:"+sum.addTwoNumbers(50, 13));
	}

}

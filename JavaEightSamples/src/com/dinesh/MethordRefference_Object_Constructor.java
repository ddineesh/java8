package com.dinesh;

import com.dinesh.interfaces.FunctionalInterfaceTest;

public class MethordRefference_Object_Constructor {

	public static void main(String[] args) {  
		
		  FunctionalInterfaceTest myInterface=AddTwoNumbers::new;
		  myInterface.addTwoNumbers(5,6);
		 
	   }  
}





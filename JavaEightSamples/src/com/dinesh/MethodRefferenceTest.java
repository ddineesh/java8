package com.dinesh;

import com.dinesh.interfaces.Interface_Default;

public class MethodRefferenceTest {

	public void myMethod(){  
		System.out.println("Instance Method");  
	    }  
	    public static void main(String[] args) {  
		Derived_Class obj = new Derived_Class();   
		// Method reference using the object of the class
		Interface_Default ref = obj::classMethod;  
		// Calling the method of functional interface  
		ref.display();  
	    }  

}

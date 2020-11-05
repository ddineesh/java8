package com.dinesh;

import com.dinesh.interfaces.MyDefaultInterface;

public class MyDerivedClass implements MyDefaultInterface {

	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	MyDerivedClass obj = new MyDerivedClass();
    	
    	//calling the default method of interface
        obj.newMethod();     
        obj.default_method();
        //calling the static method of interface
        MyDefaultInterface.anotherNewMethod();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
        
  
    }  
}

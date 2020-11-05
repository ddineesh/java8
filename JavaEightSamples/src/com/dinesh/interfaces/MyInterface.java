package com.dinesh.interfaces;

public interface MyInterface {

	void abstract_fun(int a, int b);
	
	default void default_fun()
	{
		System.out.println(" This is default method");
	}
	
}

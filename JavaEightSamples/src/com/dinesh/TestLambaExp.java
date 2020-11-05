package com.dinesh;

import com.dinesh.interfaces.MyInterface;

public class TestLambaExp {

	public static void main(String[] args) {

	MyInterface myInterface= (int x, int y) -> System.out.println(x+y);

		System.out.print(" The Result is =");
		myInterface.abstract_fun(5, 5);
		myInterface.default_fun();
	}

}

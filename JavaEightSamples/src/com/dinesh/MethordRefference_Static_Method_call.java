package com.dinesh;

import java.util.function.BiFunction;

public class MethordRefference_Static_Method_call {

	public static void main(String... strings) {

		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
		
		Integer apply = product.apply(5, 30);
		
		System.out.println("Product of given number is: "+apply);  

	}
}

class Multiplication 
{
	public static int multiply(int x, int y)
	{
		return x*y;
	}
}
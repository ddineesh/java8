package com.dinesh.interfaces;

public class RunnableInterface implements Runnable {


	@Override
	public void run() {

		for(int i=101;i<=200;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println(" The runnable thread is done");
	}

}

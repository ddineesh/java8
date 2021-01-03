package com.dinesh;

import com.dinesh.interfaces.RunnableInterface;

public class TestRunnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" The runnable thread kicked off");
		Thread runnableThread=new Thread(new RunnableInterface());
		runnableThread.start();
		System.out.println(" The main thread kicked off");
		for(int i=1;i<=100;i++)
		{
			System.out.println(i+" ");
		}
		
		System.out.println(" The main thread is done");
	}



}

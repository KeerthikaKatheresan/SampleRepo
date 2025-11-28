package com.mphasis.Maven_JDBC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefES extends Thread{
	private String order;
	public ChefES(String order)
	{
		this.order=order;
	}
	
	public void run()
	{
		for(String i:menu)
		{
			System.out.println(getName()+"is preparing "+i);
			try {
				Thread.sleep(5000);
			}
			catch( InterruptedException e)
			{
				System.out.println(getName() +"got interrupted");
			}
			System.out.println(getName()+"served" +i);
		}
	}
	public static void main(String args[])
	{
		ExecutorService m=Executors.newFixedThreadPool(4) ;// I want 4 threads
		String[] menu= {"Briyani", "Sambar", "Chicken curry", "Curd"};
		for(String i:menu)
		{
			ChefES chefThread=new ChefES(i);
			m.submit(chefThread);
			
		}
		m.shutdown();
	}

}

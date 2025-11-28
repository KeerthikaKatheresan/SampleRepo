package com.mphasis.Maven_JDBC;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		Thread t=new Thread(new RunnableDemo(),"Workerr -1");
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Vanakam");
		System.out.println("My name is :"+Thread.currentThread().getName());
		
	}

}

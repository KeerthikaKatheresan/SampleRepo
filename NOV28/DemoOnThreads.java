package com.mphasis.Maven_JDBC;

public class DemoOnThreads extends Thread{
	@Override
	public void run()
	{
		System.out.println("Nan create panna thread");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread()); //Thread[#1,main,5,main]->id ,name,priority
		//gc :daemon thread eg
		Thread t=Thread.currentThread();//for currrent thread
		System.out.println(t.getName()); //main
		System.out.println(t.getId()); //1
		System.out.println(t.getPriority()); //5
		System.out.println(t.getState()); //RUNNABLE
		System.out.println(t.isAlive()); //true
		System.out.println(t.isDaemon()); //false
		System.out.println(t.isInterrupted()); //false
		
		//creating custom thread
		MyWorkerThread t1=new MyWorkerThread();
		t1.setName("Worker1");
		t1.start();
		
		
		


	}

}

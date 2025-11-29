package com.mphasis.GargabgeCollectionDemo;

public class GCDemo {

	public static void main(String args[]) throws InterruptedException
	{
		Test test=new Test();
		test=null;//when obj points to null it is eligible and gc comes and collects it
		System.out.println("GC requested manually");
		System.gc(); //call the finalize method
		Runtime.getRuntime()//call the finalize method approach 2
		
		Thread.sleep(1000);
		System.out.println("Complete");
	}
}

class Test{
	
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collection");
	}
	
}

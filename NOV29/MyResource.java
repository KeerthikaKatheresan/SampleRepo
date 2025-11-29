package com.mphasis.GargabgeCollectionDemo;

public class MyResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Resouce closed");
	}
	
	public static void main(String args[]) throws Exception
	{
		MyResource rs=getResource();
		System.out.println("requesting gc");
		System.gc();
	}
	
	public static MyResource getResource() throws Exception
	{
		try(MyResource resource=new MyResource())
		{
			System.out.println("Hellooo");
			return resource;
		}
	}

}

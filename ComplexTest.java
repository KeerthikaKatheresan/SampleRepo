package com.mphasis.Day1MavenProject;

public class ComplexTest {
	public static void main(String[] args)
	{
		Complex c1=new Complex(3,4);
		Complex c2=new Complex(1,2);
		
		Complex sum=c1.add(c2);
		System.out.println("First" + c1);
		System.out.println("Second" +c2);
		System.out.println("Sum" +sum); 
	}

}

package com.mphasis.NOV29;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public boolean isEven(int n)
	{
		return n%2==0;
	}
	public int[] checkArrays()
	{
		int arr[]= {1,2,3};
		return arr;
	}
	
	public int checkAE()
	{
		return 5/0;
	}
}


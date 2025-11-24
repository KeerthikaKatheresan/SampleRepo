package com.mphasis.Day1MavenProject;

public class InsertArray {

	public static void main(String args[])
	{
		int[] arr=new int[10];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		int n=4;
		int pos=2;
		int val=25;
		for(int i=n;i>pos;i--)
		{
			arr[i]=arr[i-1];
			
		}
		arr[pos]=val;
		n++;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}

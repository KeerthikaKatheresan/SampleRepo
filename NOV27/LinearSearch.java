package com.mavenNov22.MavenNov25;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {88,67,56,43,9};
		int key=5;
		//boolean flag=false;
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Fount at index"+i);
				//flag=true;
				break;
			}
		}
		if(i==arr.length)//For not found condition then i will become arr.length
		{
			System.out.println("Not found");
		}
	} 

}

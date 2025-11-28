package com.mphasis.NOV28;

public class QuickSort {
	
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
		
	}
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void quicksorted(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pivot=partition(arr,low,high);
			quicksorted(arr,low,pivot-1);
			quicksorted(arr,pivot+1,high);
			
		}
	}
	public static void main(String args[])
	{
	int arr[]= {10,23,45,12,65,87,44,9,48};
	int start=0;
	int end=arr.length-1;
	quicksorted(arr,start,end);	//call merge sort
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
}

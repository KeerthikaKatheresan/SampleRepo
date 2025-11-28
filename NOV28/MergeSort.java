package com.mphasis.NOV28;

public class MergeSort {

	public static void merge(int arr[],int left,int mid,int right)
	{
		int n1=mid-left+1;	//calculate length for left subarray
		int n2=right-mid;	//calculate length for right subarray
		int larr[]=new int[n1];	//create left subarray
		int rarr[]=new int[n2];	//create right subarray
		//copy the data into arrs
		for(int i=0;i<n1;i++)
		{
			larr[i]=arr[left+i];
		}
		for(int j=0;j<n2;j++)
		{
			rarr[j]=arr[mid+1+j];
		}
		
		//merge and sort
		int i=0,j=0;
		int k=left;
		while(i<n1&&j<n2)
		{
			if(larr[i]<rarr[j])	//if larr[i] small
			{
				arr[k]=larr[i];	//insert into arr[k]
				i++;
			}
			else
			{
				arr[k]=rarr[j];//else insert rarr[j] into arr[k]
				j++;
			}
			k++;
		}
		while(i<n1)	//for leftover element in larr
		{
			arr[k]=larr[i];
			i++;
			k++;
		}
		while(j<n2)	//for leftover element in rarr
		{
			arr[k]=rarr[j];
			j++;
			k++;
		}
	}
	public static void mergeingSort(int arr[],int left,int right)
	{
		if(left>=right)	
		{
			return;
		}
		int mid=(left+right)/2;
		mergeingSort(arr,left,mid);	//recursive call
		mergeingSort(arr,mid+1,right);	//recursive call
		merge(arr,left,mid,right);	//merge 
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,23,45,12,65,87,44,9,48};
		int start=0;
		int end=arr.length-1;
		mergeingSort(arr,start,end);	//call merge sort
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

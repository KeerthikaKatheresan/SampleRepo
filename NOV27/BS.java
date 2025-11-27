package com.mavenNov22.MavenNov25;

public class BS {
	public static void main(String[] args)
	{
		int arr[]= {9,0,7,88,6,55,44,23};
		int target=5;
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==target)
			{
				System.out.println("found ");
				break;
			}
			else if(arr[mid]<target)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("Not found");
		}
		
	}

}

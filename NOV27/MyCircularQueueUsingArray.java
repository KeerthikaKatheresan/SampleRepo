package com.mavenNov22.MavenNov25;

public class MyCircularQueueUsingArray {
	private static int front=-1;
	private static int rear=-1;
	private static int cq[]=new int[5];
	public static boolean isEmpty()
	{
		if(front==-1||rear==-1)
		{
			return true; 
		}
		return false;
	}
	public static boolean isFull()
	{
		if((rear+1)%cq.length==front)
		{
			return true;
		}
		return false;
	}
	public static void  push(int x)
	{
		if(isFull())
		{
			System.out.println("No space");
			return;
		}
		if(isEmpty())
		{
			cq[++front]=x;
			rear++;
		}
		else
		{
			rear=(rear+1)%cq.length;
			cq[rear]=x;
		}
		System.out.println("Data inserted successfully"+x);
		
	}
	
	public static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty cannot delete anything");
		}
		else
		{
			System.out.println(cq[front++]);
		}
	}
	
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("List is empty da");
		}
		else
		{
			for(int i=front;i!=rear;i=(i+1)%cq.length)
			{
				System.out.println(cq[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		pop();
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(20);
		push(20);
		
	}
	
	
	
}

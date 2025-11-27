package com.mavenNov22.MavenNov25;

public class MyQueueArray {
	private static int front =-1;
	private static int rear=-1;
	private static int[] queue=new int[10];
	
	public static boolean isEmpty()
	{
		if(front==-1||front>rear)
		{
			return true;
		}
		return false;
	}
	public static boolean isFull()
	{
		return rear==queue.length-1;
	}
	public static void push(int x)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		if(front ==-1 && rear==-1)
		{
			queue[++front]=x;
			rear++;
			System.out.println("Inserted successfully:"+x);
		}
		else
		{
			queue[++rear]=x;
			System.out.println("Inserted successfully:"+x);
		}
	}
	
	public static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Queue empty cannot pop");
			return;
		}
		else
		{
			System.out.println(queue[front++]);
		}
	}
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty so cannot display anything");
		}
		else
		{
			for(int i=0;i<rear;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
	public static void main(String args[])
	{
		pop();
		push(15);
		push(54);
		push(78);
		push(67);
		push(5);
		display();
	}
	                                                       
}


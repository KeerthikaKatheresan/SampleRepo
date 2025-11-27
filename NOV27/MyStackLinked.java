package com.mavenNov22.MavenNov25;

import java.util.Scanner;

public class MyStackLinked {

	 public static Node top=null;
	
	 public static boolean isEmpty()
	 {
		 return top==null;
	 }
	public static Node createNode()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int data=sc.nextInt();
		return new Node(data);
		
	}
	 public static void push()
	 {
		 Node newNode =createNode();
		 if(top==null)
		 {
			 top=newNode;
		 }
		 else
		 {
			 newNode.setNext(top);
			 top=newNode;
		 }
		 System.out.println("Success da" +newNode.getData());
	 }
	 
	 public static void pop()
	 { 
		 if(isEmpty())
		 {
			 System.out.println("No kanna no element to delete");
		 }
		 else {
			 System.out.println(top.getData()+"is popped");
			 Node temp=top;
			 top=top.getNext();
			 temp.setNext(null);
		 }
	 }
	 
	 public static void display()
	 {
		 if(isEmpty())
		 {
			 System.out.println("No elements to katta");
			 return ;
		 }
		 else
		 {
		 Node temp=top;
		 while(temp!=null)
		 {
			 System.out.print(temp.getData()+"-->");
			 temp=temp.getNext();
		 }
		 System.out.println("Null");
	 }
	 }
}

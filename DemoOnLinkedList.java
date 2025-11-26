package com.mavenNov22.MavenNov25;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	public static void main(String args[])
	{
		Integer[] irr= {78,56,45,23};
		LinkedList<Integer> ll =new LinkedList<Integer>(Arrays.asList(irr));
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(ll.offer(5)); //adds at last
		System.out.println(ll);
		 System.out.println(ll.peekLast());
		 System.out.println(ll.pollLast());
		 System.out.println(ll);
		 ll.add(90);
		 ll.add(2,57);//index,value
		 System.out.println(ll);
		 ll.set(2, 22); //update index,value
		 System.out.println(ll);
		 ll.add(56);
		 System.out.println(ll);
		 ll.remove();//no index given remove 1st element
		 System.out.println(ll);
		 ll.remove(2);//index mentioned
		 System.out.println(ll);
		 ll.poll();
		 
		 
	}
	

}

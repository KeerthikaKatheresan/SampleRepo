package com.mavenNov22.MavenNov25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoOnArrayList {

	public static void main(String[] args) {
		//Without generics->Heterogeneous supported
		ArrayList alist=new ArrayList();
		alist.add("Keerthi");
		alist.add(21);
		alist.add(true);
		Person p=new Person("Kavi",5);
		alist.add(p);	
		alist.add(21);//duplicates allowed
		alist.add(null);//null also allowed 
		alist.add(null);
		System.out.println(alist.get(0));//to access particular ele;order is preserved
		System.out.println(alist);
		
		//With generics->Homogenous only
		ArrayList<String> namesList=new ArrayList<String>();
		namesList.add("Amit");
		namesList.add("Kavi");
		namesList.add("Pragya");
		namesList.add("Blue");
		
		System.out.println(namesList);
		for(String i:namesList)	//using enhanced for loop
		{
			System.out.println(i);
		}
		
		//Using iterator ->Concurrent modification is possible->if you remove an element it is reflected back in the origial collection
		Iterator<String> itr=namesList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Using list iterator
		ListIterator<String> litr=namesList.listIterator();
		while(litr.hasNext())//print forward direction
		{
			System.out.println(litr.next());
		}
//		
		while(litr.hasPrevious())	//print reverse direction
		{
			System.out.println(litr.previous());
		}
//		
		System.out.println(namesList.contains("Keerthi"));//true
		namesList.forEach(name->System.out.println(name)); //using lambda(consumer)
		namesList.forEach(System.out::println); //using method refernce
		
		 
		
		
	}

}

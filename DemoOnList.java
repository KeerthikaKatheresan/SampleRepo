package com.mavenNov22.MavenNov25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoOnList {
	public static void main(String args[])
	{
	
//	Integer[] arr = {2, 3, 4, 5};
//	Integer[] brr = {8, 7, 2, 0,5, 6};
//
//	List<Integer> numlist1 = new ArrayList<>(Arrays.asList(arr));
//	List<Integer> numlist2 = new ArrayList<>(Arrays.asList(brr));
//
//	System.out.println(numlist1);
//	System.out.println(numlist1.retainAll(numlist2));	//intersect two and if changes happen na op true
//	System.out.println(numlist1);
//	
//	
//	ArrayList<String> namesList=new ArrayList<String>();
//	namesList.add("Amit");
//	namesList.add("Kavi");
//	namesList.add("Pragya");
//	namesList.add("Blue");
//	Collections.sort(namesList);
//	System.out.println(namesList);// the original nameList is modified 
//	
//	//clone
//	ArrayList<String> clonedNameList=(ArrayList<String>)namesList.clone();
//	System.out.println(namesList.hashCode());
//	System.out.println(clonedNameList.hashCode());//same hash code
//	
//	clonedNameList.add("Bhargav");	//change /add something to anyone copy
//	System.out.println(namesList.hashCode());
//	System.out.println(clonedNameList.hashCode());//hash code is diff
		
	//using comparator & comparable->our custom defined class na use this for sorting
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(123,"Swapna",40,90,"Hyderabad"));
		studentList.add(new Student(124,"Keerthhi",21,95,"Tj"));
		studentList.add(new Student(125,"tupa",90,90,"Chennai"));
		studentList.add(new Student(126,"moha",45,90,"Chennai"));
		studentList.add(new Student(201, "Arjun", 22, 88, "Delhi"));
		studentList.add(new Student(202, "Meera", 25, 92, "Mumbai"));
		studentList.add(new Student(203, "Ravi", 28, 76, "Chennai"));
		studentList.add(new Student(204, "Sneha", 23, 95, "Bangalore"));
		studentList.add(new Student(205, "Vikram", 30, 81, "Hyderabad"));
		studentList.add(new Student(206, "Priya", 27, 89, "Kolkata"));
		studentList.add(new Student(301, "Karthik", 24, 85, "Pune"));
		studentList.add(new Student(302, "Divya", 26, 91, "Coimbatore"));
		studentList.add(new Student(303, "Suresh", 29, 78, "Bangalore"));
		studentList.add(new Student(304, "Anitha", 22, 94, "Bangalore"));
		studentList.add(new Student(305, "Rahul", 31, 83, "Bangalore"));


		for(Student s:studentList)
		{
			System.out.println(s);
		}
		Collections.sort(studentList);	//studentclass implements comapable<T> and overrides comapareTo()
		for(Student s:studentList)//after sortings
		{
			System.out.println(s);
		}	
		
		
		//using Comparator 
		studentList.sort(new StudentComparator()
				.thenComparing(new NameComparator()));
		System.out.println("***************");
		for(Student s:studentList)//after sortings
		{
			System.out.println(s);
		}
		
		
		

	 
	

	}
}

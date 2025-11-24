package com.mphasis.Day1MavenProject;

import java.util.Arrays;
import java.util.function.Consumer;

public class DemoOnConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//num*num
		int num=5;
		Consumer<Integer> c=(num1)->{
			System.out.println(num1*num1);
		};
		c.accept(num);
		
		
		//sort an array
		Integer[] arr= new Integer[]{45,78,42,90};
		Consumer<Integer[]> c1=(arr1)->
		{
			Arrays.sort(arr);
			for(Integer i:arr)
			{
				System.out.println(i);
			}
		};
		c1.accept(arr);
		
		
//		Employee[] emp=new Employee[5];
//		emp[0]= new Employee("Alice", 101, "Developer", "9876543210", 55000);
//        emp[1] = new Employee("Bob", 102, "Tester", "9123456780", 45000);
//        emp[2] = new Employee("Charlie", 103, "Manager", "9988776655", 75000);
//        emp[3] = new Employee("Diana", 104, "HR", "9090909090", 50000);
//        emp[4] = new Employee("Ethan", 105, "Designer", "9191919191", 48000);
//		
//        Consumer<Employee[]> c2=(e)->{
//        	for(Employee[] i:emp)
//        		System.out.println(e.getEmployee());
//        };
//        	
//	
//	for(Employee i:emp)
//	{
//	c2.accept(i);
//	}

}
}

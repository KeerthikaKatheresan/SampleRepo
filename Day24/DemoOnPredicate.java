package com.mphasis.Day1MavenProject;

import java.util.function.Predicate;

public class DemoOnPredicate {
	public static void main(String args[])
	{
		String s="keerthika";
		Predicate<String> p=(str)->str.length()>7;
		System.out.println(p.test(s));
		
		
		Employee emp1=new Employee("Alice", 101, "Developer", "9876543210", 55000);
		Employee emp2 = new Employee("Bob", 102, "Tester", "9123456780", 45000);
		Employee emp3 = new Employee("Charlie", 103, "Manager", "9988776655", 75000);
		
		Employee[] arr= {emp1,emp2,emp3};
		Predicate<Employee> p1=(emp)->emp.getSalary()>50000;
		for(Employee e:arr)
		{
			if(p1.test(e))
			{
				System.out.println(e);
			}
		}

		
	}

}

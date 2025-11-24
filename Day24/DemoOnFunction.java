package com.mphasis.Day1MavenProject;

import java.util.function.Function;

public class DemoOnFunction {
	public static void main(String args[]) {
		Function<Integer,String> f=(num)->{
			if(num*num>50)
			{
				return "Greater than 50";
			}
			else
			{
				return "Less than 50";
			}
		};
		System.out.println(f.apply(5));
	
	
	
	Employee emp1=new Employee("Alice", 101, "Developer", "9876543210", 55000);
	Employee emp2 = new Employee("Bob", 102, "Tester", "9123456780", 45000);
	Employee emp3 = new Employee("Charlie", 103, "Manager", "9988776655", 75000);
	Employee[] arr= {emp1,emp2,emp3};
	
	Function<Employee,String> f1=(e)-> { return e.getEmployee().toUpperCase();};
	for(Employee i:arr)
	{
		System.out.println(f1.apply(i));
	}
	
	//chaining 
	Function<Integer,Integer> f3=(num)->num*num;
	
	Function<Integer,Integer> add20=(num)->num+20;
	System.out.println(f3.andThen(add20).apply(10));	//first do num*num then apply(10)
	
	
	Function<Employee,Integer> f4=(e)->
	{
		if(e.getSalary()>50000)
		{
			e.salary=e.salary+1000;
			System.out.println("Bouns added");
			return (int) e.salary;
		}
		else {
			System.out.println("No Bonus bhai");
			return (int) e.salary;
		}
	};
	for(Employee i:arr)
	{
		f4.apply(i);
	}
	

}
}
                                              
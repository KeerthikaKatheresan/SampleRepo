package com.mavenNov22.MavenNov25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Integer arr[]= {9,7,89,66,5,7,9};
    	System.out.println(Arrays.toString(arr)); //just to print the array
    	Arrays.stream(arr).forEach(System.out::println);
    	List<Integer> iList=Arrays.stream(arr).collect(Collectors.toList());
    	System.out.println(iList);
    	
    	//Terminal operations ->min(),count(),reduce()
//    	Integer min=Arrays.stream(arr).min((a,b)->a-b).get();
//    	System.out.println(min);
//    	min=Arrays.stream(arr).min(Integer::compare).get();
//    	System.out.println(min);
    	
    	long count=Arrays.stream(arr).count();
    	System.out.println(count);
    	
    	//reduce ->2 param ;reduce(identity, accumulator)
    	//do some operation and op is reduce to a single value
    	
    	Integer sum=Arrays.stream(arr).reduce(0, (a,b)->a+b);
    	System.out.println(sum);
    	//printing min using reduce
    	Integer min=Arrays.stream(arr).reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
    	System.out.println(min);
    	
    	// Intermediate operations

    	// 1. filter
    	Stream.of(arr)
    	      .filter(n -> n % 2 == 0)
    	      .forEach(System.out::println);

    	// 2. map
    	Stream.of(arr)
    	      .map(num -> num * num)
    	      .forEach(System.out::println);

    	//3.limit
    	System.out.println("*********");
    	Stream.of(arr).limit(3).forEach(System.out::println);
    	
    	//4.Distinct
    	Stream.of(arr).distinct().forEach(System.out::println); //duplicates will not be printed
    	
    	//count the distinct elements
    	Stream.of(arr)
    		.distinct()
    		.count();
    	//5.skip
    	System.out.println("*********");
    	Stream.of(arr).skip(2).forEach(System.out::println);
    	
    	//6.anymatch->Predicate so op:bool
    	System.out.println("*********");
    	System.out.println(Stream.of(arr).anyMatch(n->n>25));
    	
    	//7.findFirst
    	//short-circuit will happen
    	System.out.println(Stream.of(arr).filter(n->n>25).findFirst().get());
    	
    	System.out.println("*********");
    	Integer[] nums= {26,78,55,67,23,45,99,8,67,222,21,66};
    	List<Integer> numList=Arrays.asList(nums);
    	numList.stream().filter(n->n%3==0).distinct().forEach(System.out::println);
    	
    	System.out.println("*********");
    	//find multiples of 3,removes duplicated,skip first 2 element,extract only 2 element
    	numList.stream().filter(n->n%3==0).distinct().skip(2).limit(2).forEach(System.out::println);
    	
    	//sorted
    	System.out.println("*********");
    	numList.stream().sorted().forEach(System.out::println);
    	
    	//revrese sort
    	System.out.println("*********");
    	numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	
    	
    	//String and Stream
    	String[] names= {"keerthi","smrithi","kavi","george"};
    	//convert into stream using collection(Arrays) and filter where length is greatre than 5
    	Arrays.stream(names).filter(name->name.length()>=5).forEach(System.out::println);
    	
    	//startsWith 
    	System.out.println("*********");
    	Arrays.stream(names).filter(name->name.startsWith("s")).forEach(System.out::println);
    	
    	//sort names
    	System.out.println("*********");
    	Arrays.stream(names).sorted().forEach(System.out::println);
    	//sort based on reverse order
    	System.out.println("*********");
    	Arrays.stream(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    	
    	
    	
    	
    	//user defined object and streams
    	System.out.println("*********");
    	Employee e1 = new Employee(101, "Alice", 55000.0, "Developer", "IT");
        Employee e2 = new Employee(102, "Bob", 60000.0, "Manager", "HR");
        Employee e3 = new Employee(103, "Charlie", 70000.0, "Analyst", "Finance");
        Employee e4 = new Employee(104, "Diana", 48000.0, "Tester", "QA");
        Employee e5 = new Employee(105, "Ethan", 75000.0, "Architect", "Engineering");
        Employee e6 = new Employee(106, "Abi", 70000.0, "Manager", "HR");
    	
        Employee[] empList= {e1,e2,e3,e4,e5,e6};
        List<Employee> elist=Arrays.asList(empList);
        
        elist.forEach(System.out::println);//filter by salary >55000.0
        System.out.println("*********");
        elist.stream().filter(emp->emp.getSalary()>55000.0).forEach(System.out::println);
        
        System.out.println("*********");//sort by name and print
        elist.stream().filter(emp->emp.getDesg().equals("Manager"))
        .sorted((emp1,emp2)->e1.getEmpName().compareTo(e2.getEmpName()))
        .forEach(System.out::println);
    	
    }
}

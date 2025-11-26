package com.mavenNov22.MavenNov25;

import java.util.Arrays;

public class DemoOnGenerics {
	
	public static<T> void print(T data)
	{
		System.out.println("The data is:"+data);
	}
	
	public static<A extends Number,B extends Number> void add(A a1,B b1)
	{
		System.out.println(a1.doubleValue()+b1.doubleValue());
	}
	public static void main(String args[])
	{
//		Container<String> c1=new Container<String>();
//		c1.setItem("Keerthi");
//		System.out.println(c1.getItem());
//		
//		Container<Student> c2=new Container<Student>();
//		Student s=new Student();
//		c2.setItem(s);
//		System.out.println(c2.getItem());
//		
//	
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItem(77);
//		System.out.println(c3.getItem());
//		
//		
//		Container<Integer[]> c4=new Container<Integer[]>();
//		Integer arr[]= {7,8,6,5};
//		c4.setItem(arr);
//		System.out.println(Arrays.toString(c4.getItem()));	//c4.getitem() will pass the address to Arrays.toString
//		
		
//		Pair<String,Double> p1=new Pair<String,Double>("distance in km",7.5);
//		System.out.println(p1);
//		Pair<String,Double> p2=new Pair<String,Double>("weight in kg",6.0);
//		System.out.println(p2);
//		Pair<Integer,String> p3=new Pair<Integer,String>(1,"Laptop");
//		System.out.println(p3);
//		Student s=new Student(101,"Keerthi","CyberSecurity");
//		Pair<Integer,Student> p4=new Pair<Integer,Student>(1,s);
//		System.out.println(p4.getValue());
//		
//		Order<String> o1=new Order<String>("Banana");
//		Order<String> o2=new Order<String>("Laptop");
//		
//		System.out.println(o1);
//		System.out.println(o2);
//		
//		Item item=new Item(12,"Laptop",50000);
//		Order<Item> o3=new Order<Item>(item);
//		System.out.println(o3.getItem());
//		
//		Item i1=new Item(2,"Mobile",500);
//		Item i2=new Item(3,"Phone",100);
//		Item i3=new Item(4,"Watch",30);
//		
//		Order<Item>[] o4=new Order[3];
//		
//		o4[0]=new Order<Item>(i1);
//		o4[1]=new Order<Item>(i2);
//		o4[2]=new Order<Item>(i3);
//		
//		
//		for(Order<Item> o:o4)
//		{
//			System.out.println(o.getItem());
//		}
//		
//		Integer[] nums= {4,3,7,8,9};
//		String[] strs= {"str1","str2","str3"};
//		ArrayPrinter<Integer> ap1=new ArrayPrinter<>(nums);
//		ArrayPrinter<String> ap2=new ArrayPrinter<>(strs);
//		System.out.println(ap1.toString());
//		System.out.println(ap2.toString());
//		
		
		//generic method 
		print("Keerthi");
		print(34);
		Item i1=new Item(11,"Mobile",90);
		print(i1);
		
		//add using generic method
		add(9,10);
		//add("Ke","KK");// ->because add only double will work
		
		
	}

}

package com.mphasis.Day1MavenProject;

import java.util.function.Supplier;

public class DemoOnSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="keerthika";
		Supplier<String> sup=()->name.concat(" Kadhiresan");
		System.out.println(sup.get());	//get is the method defined in Supplier FI
		
		//for printing random number
		Supplier<Integer> rd=()->{
			return (int) (Math.random()*100);
		};
		System.out.println(rd.get());
		
		//to find max number
		int a=1;int b=5;
		Supplier<Integer> rs=()->{
			return (a>b?a:b);
		};
		System.out.println(rs.get());
	}

}

package com.mphasis.Day1MavenProject;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoMethodReference {

	
		// TODO Auto-generated method stub
		
		//classname::methodname
		//objname::methodname
		
		static class NumberUtil{
			public static int squareNum(int num)
			{
				return num*num;
			}
			
			public static double log(double num)
			{
				return Math.log(num);
			}
			
			public static boolean isEven(int num)
			{
				return num%2==0;
			}
			
			public static Integer stringLength(String str)
			{
				
				return str.length();
			}
		}
		
		
		
		public static void main(String args[])
		{
			Function<Integer,Integer> sf=(num)->NumberUtil.squareNum(num);	//using lambda expression
			System.out.println(sf.apply(6));
			
			Function<Integer,Integer> sf1=NumberUtil::squareNum;	//method reference
			System.out.println(sf1.apply(5));
			
			
			//Find log using method reference
			Function<Double,Double> sf2=NumberUtil::log;
			System.out.println(sf2.apply(7.08));
			
			//Using lambda
			Function<Double,Double> sf3=(num)-> Math.log(num);
			System.out.println(sf3.apply(76.98));
			
			//Find is even?? method refernce
			Predicate<Integer> p1=NumberUtil::isEven;
			System.out.println(p1.test(2));
			
			//using lambda
			Predicate<Integer> p2=(num)->NumberUtil.isEven(num);
			System.out.println(p2.test(3));
			
			//find length of string using method refernce
			Function<String,Integer> f4=(str)->NumberUtil.stringLength(str);
			System.out.println(f4.apply("Keerthika"));
			
			//using method refernce
			Function<String,Integer> f5=NumberUtil::stringLength;
			System.out.println(f5.apply("JD"));
			
			
			
			
			
		}

	}



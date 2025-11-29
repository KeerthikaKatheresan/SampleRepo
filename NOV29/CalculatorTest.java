package com.mphasis.NOV29;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator c = new Calculator();
		int expected = 5;
		int actual = c.add(5, 4);
		assertEquals(expected, actual);
	}

	@Test
	public void subTest() {
		Calculator c = new Calculator();
		int expected = 5;
		int actual = c.sub(5, 7);
		assertEquals(expected, actual);
	}

	@Test
	public void mulTest()
	{
		Calculator c=new Calculator();
		int expected=10;
		int actual=c.mul(2, 5);
		assertEquals(expected,actual);
	}
	
	@Test
	public void isEvenTest()
	{
		Calculator c=new Calculator();
		boolean value=c.isEven(5);
		assertTrue(value,"Brooo");		//compare whethere the ip is correct or not ->boolean 
		
	}
	@Test
	public void checkTextTest()
	{
		assertNull(new App().CheckText());
	}
	
	//check whether it is not null
	@Test
	public void checkTextTestNotNull()
	{
		assertNotNull(new App().CheckText());
	}
	
	//comparing two array
	@Test
	public void checkArraysTest()
	{
		int brr[]= {1,2,3};
		assertArrayEquals(brr,new Calculator().checkArrays());
	}
	
	@Test
	public void checkArraysTest1()
	{
		int brr[]= {1,2,3};
		assertSame(brr,new Calculator().checkArrays());
	}
	
//	@Test
//	public void checkAE()
//	{
//		
//	}
	
	@BeforeEach
	public void BeforeEachTest()
	{
		System.out.println("Line for before each");
	}
	
	@BeforeAll
	public static void BeforeAllTest()
	{
		System.out.println("Line for before all");
	}
	
	@AfterEach
	public  void AfterEachTest()
	{
		System.out.println("Line for after each");
	}
	
	@AfterAll
	public static void AfterAllTest()
	{
		System.out.println("Line for after all");
	}
	
}

package com.mphasis.NOV29;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ShapeTest {

	@ParameterizedTest
	@ValueSource(classes= {Circle.class,Sqaure.class})
	public void TestShapetypes(Class<? extends Shape> s)
	{
		//Shape shape=
		//Class<?> expected=s;
		//Class<?> actual=
		
	}
}

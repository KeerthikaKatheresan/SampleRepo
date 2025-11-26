package com.mavenNov22.MavenNov25;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	
	
	@Override
	public int compare(Student o1,Student o2)
	{
		return o1.getCity().compareTo(o2.getCity());
	}
	

}

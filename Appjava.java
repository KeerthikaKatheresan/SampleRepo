package com.mphasis.Day1MavenProject;

public class Appjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		
		emp.setEmpId(1);
		emp.setEmployee("Keerthi");
		emp.setMobileNum("65789765432");
		emp.setDesg("Traineer");
		System.out.println(emp);
		
		Employee e1=new Employee("Amit",23,"Manager","9089887867");
		System.out.println(e1);

	}

}

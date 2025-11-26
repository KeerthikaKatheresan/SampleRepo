package com.mavenNov22.MavenNov25;

public class Student implements Comparable<Student>{
	private int sid;
	private String sname;
	private int age;
	private String city;
	private double marks;
	/**
	 * 
	 */
	public Student() {
		super();
	}
	/**
	 * @param sid
	 * @param sname
	 * @param age
	 * @param city
	 */
	public Student(int sid, String sname, int age,double marks,String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.marks=marks;
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", city=" + city + ", marks=" + marks
				+ "]";
	}
//	@Override
//	public int compareTo(Student s)
//	{
//		return this.sid-s.sid;
//	}
	
//	 use this when u want to compare string
	@Override
	public int compareTo(Student s)
	{
		return this.sname.compareTo(s.sname);
	}
	
	
	
	

}

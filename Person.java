package com.mavenNov22.MavenNov25;

public final class Person {
	private final String name;
	private final int uid;
	/**
	 * @param name
	 * @param uid
	 */
	public Person(String name, int uid) {
		super();
		this.name = name;
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public int getUid() {
		return uid;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", uid=" + uid + "]";
	}
	
	
	

}
